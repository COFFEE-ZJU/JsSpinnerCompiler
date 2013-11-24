package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.CharBuffer;

import com.google.gson.Gson;

public class JSSchemaServer {
	public static final int LISTEN_PORT = 2048;
	
	class JsonSchemaQuery{
		String type;
		String wrapper_name;
	}
	
	class ExecThread extends Thread{
		Socket socket;
		public ExecThread(Socket s){
			socket = s;
		}
		
		@Override
		public void run(){
			try {
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				byte[] b = new byte[1024];
				int len = in.read(b);
				//in.close();
				String jsonString = new String(b,0,len);
				System.out.println(jsonString);
				JsonSchemaQuery query = new Gson().fromJson(jsonString, JsonSchemaQuery.class);
				BufferedReader reader = new BufferedReader(new FileReader(query.wrapper_name + ".txt"));
				StringBuffer outString = new StringBuffer();
				String tmp;
				while((tmp = reader.readLine()) != null){
					outString.append(tmp);
				}
				
				//System.out.println(outString);
				out.write(outString.toString().getBytes());
				out.flush();
				//out.close();
				
				socket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public JSSchemaServer() throws IOException{
		ServerSocket ss = new ServerSocket(LISTEN_PORT);
		Socket s;
		while(true){
			s = ss.accept();
			new ExecThread(s).start();
		}
	}
	
	public static void main(String[] args) throws IOException {
		new JSSchemaServer();
	}

}
