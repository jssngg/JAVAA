package dd;

import java.io.*;

import java.net.*;

public class MainClient{
public static void main(String [] args)
{
	try{
		Socket c_so = new Socket("127.0.0.1" , 8888);
		
		InputStream input_d = c_so.getInputStream();
		byte[]  receiveBuffer = new byte[100];
		input_d.read(receiveBuffer);
		System.out.println(new String(receiveBuffer));
		
		
		c_so.close();
		
		
		}catch(IOException e){
			e.printStackTrace();
		}
	
}
}


