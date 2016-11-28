package dd;

import java.io.*;
import java.net.*;

public class MainServer {
	public static void main(String [] args){
		try{
			ServerSocket s_so = new ServerSocket(8888);
			Socket c_so = s_so.accept();
			OutputStream output_d = c_so.getOutputStream();
			
			String sendDataString  = "Welcome to my Server ! ";
		output_d.write(sendDataString.getBytes());
			s_so.close();
			c_so.close();
			
		}catch(IOException e ){
			e.printStackTrace();
		}
	}

}
