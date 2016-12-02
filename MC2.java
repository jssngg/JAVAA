package dd;

import java.io.*;
import java.util.*;

import java.net.*;

public class MC2{

public static void main(String [] args)
{	Scanner s = new Scanner(System.in);

	try{

		Socket c_so = new Socket("127.0.0.1" , 12958);
	
		InputStream input_d = c_so.getInputStream();
		String rec = s.next();
		byte[]  receiveBuffer = new byte[100];
		input_d.read(receiveBuffer);
		System.out.println(new String(receiveBuffer));
		
		
		c_so.close();
		
		
		}catch(IOException e){
			e.printStackTrace();
		}
	
}


}

