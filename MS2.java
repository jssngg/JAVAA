package dd;

import java.io.*;
import java.net.*;
import java.util.*;
public class MS2 {

	public static void main(String [] args){
		try{
			Scanner s = new Scanner (System.in);
			ServerSocket s_so = new ServerSocket(12958);
			Socket c_so = s_so.accept();
			OutputStream output_d = c_so.getOutputStream();
			
			String sendDataString  = "Welcome to my Server ! ";
			output_d.write(sendDataString.getBytes());
			boolean A = true;
			while(A == true){
			String sendDataString2  =s.next(); ;
			if(sendDataString2.equals("exit")){
			
				A = false;
			}
			output_d.write(sendDataString2.getBytes());
			}
			s_so.close();
			c_so.close();
			
		}catch(IOException e ){
			e.printStackTrace();
		}
	}

}
