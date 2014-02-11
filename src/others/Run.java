package others;
/***
 * Excerpted from "The Definitive ANTLR 4 Reference",

 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import visitors.JaqlVisitor;

import antlrGen.JaqlGrammarLexer;
import antlrGen.JaqlGrammarParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import constants.Constants;
import constants.SyntaxErrorException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
	private int threadNum = 0;
	
	public Run() throws IOException{
		ExecutorService threadPool = Executors.newFixedThreadPool(Constants.THREAD_POOL_NUM);
		ServerSocket ss = new ServerSocket(Constants.LISTEN_PORT);
    	Socket s;
    	while(true){
    		s = ss.accept();
    		threadPool.execute(new InterpretThread(s,threadNum));
    		synchronized ((Object)threadNum) {
    			System.out.println("query arrived, thread "+threadNum+" started");
				threadNum ++;
			}
    	}
	}
    
    class InterpretThread implements Runnable{
    	private Socket socket;
    	private int threadNo;
    	public InterpretThread(Socket s, int no){
    		socket = s;
    		threadNo = no;
    	}
    	
    	public void run(){
    		try {
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				byte[] b = new byte[Constants.INPUT_STREAM_LENGTH];
				int len = in.read(b);
				
				JaqlVisitor eval = new JaqlVisitor();
				try{
					ANTLRInputStream input = new ANTLRInputStream(new String(b,0,len));
			        BailJaqlGrammarLexer lexer = new BailJaqlGrammarLexer(input);
			        CommonTokenStream tokens = new CommonTokenStream(lexer);
			        JaqlGrammarParser parser = new JaqlGrammarParser(tokens);
			        parser.removeErrorListeners();
			        parser.addErrorListener(new ErrorListener());
			        //parser.setErrorHandler(new BailErrorStrategy());
			        ParseTree tree = parser.prog(); // parse
	
			        eval.visit(tree);
				} catch (SyntaxErrorException e) {
					eval.genErrorTree(e);
					//e.printStackTrace();
				}
		        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		        out.write(gson.toJson(eval.resultTrees).getBytes());
		        out.flush();
		        out.close();
		        in.close();
		        socket.close();
		        
		        synchronized ((Object)threadNum) {
	    			System.out.println("query excuted, thread "+threadNo+" ended");
					threadNum --;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
    
    public static void main(String[] args) throws Exception {
    	
    	new Run();
    }
}
