import java.net.*;			
import java.io.*;			
			
public class EchoServer {			
			
	public static void main(String[] args) {		
		try{	
			ServerSocket server = new ServerSocket(10001);
			System.out.println("������ ��ٸ��ϴ�.");
			Socket sock = server.accept();
			InetAddress inetaddr = sock.getInetAddress();
			System.out.println(inetaddr.getHostAddress() + " �� ���� �����Ͽ����ϴ�.");
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;	
			while((line = br.readLine()) != null){	
				System.out.println("Ŭ���̾�Ʈ�� ���� ���۹��� ���ڿ� : " + line);
				pw.println(line);
				pw.flush();
			}	
			pw.close();	
			br.close();	
			sock.close();	
		}catch(Exception e){		
			System.out.println(e);	
		}		
	} // main			
}				
