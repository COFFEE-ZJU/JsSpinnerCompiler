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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileInputStream;
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
				
				ANTLRInputStream input = new ANTLRInputStream(new String(b,0,len));
		        JaqlGrammarLexer lexer = new JaqlGrammarLexer(input);
		        CommonTokenStream tokens = new CommonTokenStream(lexer);
		        JaqlGrammarParser parser = new JaqlGrammarParser(tokens);
		        ParseTree tree = parser.prog(); // parse

		        TransVisitor eval = new TransVisitor();
		        eval.visit(tree);
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
//		String inputFile = null;
//		if ( args.length>0 ) inputFile = args[0];
//		InputStream is = System.in;
//		if ( inputFile!=null ) is = new FileInputStream(inputFile);
//		ANTLRInputStream input = new ANTLRInputStream(is);
//		JaqlSampleLexer lexer = new JaqlSampleLexer(input);
//		CommonTokenStream tokens = new CommonTokenStream(lexer);
//		JaqlSampleParser parser = new JaqlSampleParser(tokens);
//		ParseTree tree = parser.prog(); // parse
//		
//		TransVisitor eval = new TransVisitor();
//		eval.visit(tree);
    	
    	new Run();
    }
}
