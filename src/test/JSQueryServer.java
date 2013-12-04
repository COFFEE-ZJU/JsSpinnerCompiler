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

public class JSQueryServer {
	public static final int SEND_PORT = 3000;
	
	class ExecThread extends Thread{
		String queryFileName;
		public ExecThread(String query){
			queryFileName = query;
		}
		
		@Override
		public void run(){
			try {
				Socket socket = new Socket("localhost", SEND_PORT);
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				BufferedReader reader = new BufferedReader(new FileReader(queryFileName + ".txt"));
				StringBuffer outString = new StringBuffer();
				String tmp;
				while((tmp = reader.readLine()) != null){
					outString.append(tmp);
				}
				out.write(outString.toString().getBytes());
				out.flush();
				
				byte[] b = new byte[10240];
				int len = in.read(b);
				String jsonString = new String(b,0,len);
				System.out.println(jsonString);
				
				in.close();
				out.close();
				socket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public JSQueryServer() throws IOException{
		int i =0;
		new ExecThread("input_3").start();
		while(i < 1){
			new ExecThread("input").start();
			i++;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new JSQueryServer();
	}

}
