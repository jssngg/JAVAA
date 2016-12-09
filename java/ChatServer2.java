import java.net.*;				
import java.io.*;				
import java.util.*;				
				
public class ChatServer2 {				
				
	public static void main(String[] args) {			
		try{		
			ServerSocket server = new ServerSocket(10002);	
			System.out.println("¡¢º”¿ª ±‚¥Ÿ∏≥¥œ¥Ÿ.");	
			HashMap hm = new HashMap();	
			while(true){	
				Socket sock = server.accept();
				ChatThread chatthread = new ChatThread(sock, hm);
				chatthread.start();
			} // while	
		}catch(Exception e){	
			System.out.println(e);
		}	
	} // main		
}			
			
class ChatThread extends Thread{			
	private Socket sock;		
	private String id;		
	private BufferedReader br;		
	private HashMap hm;		
	private boolean initFlag = false;		
	public ChatThread(Socket sock, HashMap hm){		
		this.sock = sock;	
		this.hm = hm;	
		try{	
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));	
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));	
			id = br.readLine();	
			broadcast(id + "¥‘¿Ã ¡¢º”«œø¥Ω¿¥œ¥Ÿ.");	
			System.out.println("¡¢º”«— ªÁøÎ¿⁄¿« æ∆¿Ãµ¥¬ " + id + "¿‘¥œ¥Ÿ.");	
			synchronized(hm){	
				hm.put(this.id, pw);
			}	
			initFlag = true;	
		}catch(Exception ex){		
			System.out.println(ex);	
		}		
	} // ª˝º∫¿⁄			
	public void run(){			
		try{		
			String line = null;	
			while((line = br.readLine()) != null){		
				if(line.equals("/quit"))	
					break;
				if(line.equals("/l"))	
					printlist();
				if(line.indexOf("/to ") == 0){	
					sendmsg(line);
				}else	
					broadcast(id + " : " + line);
			}		
		}catch(Exception ex){			
			System.out.println(ex);		
		}finally{			
			synchronized(hm){		
				hm.remove(id);	
			}		
			broadcast(id + " ¥‘¿Ã ¡¢º” ¡æ∑·«œø¥Ω¿¥œ¥Ÿ.");		
			try{		
				if(sock != null)	
					sock.close();
			}catch(Exception ex){}		
		}			
	} // run				
	public void sendmsg(String msg){				
		int start = msg.indexOf(" ") +1;			
		int end = msg.indexOf(" ", start);			
		if(end != -1){			
			String to = msg.substring(start, end);		
			String msg2 = msg.substring(end+1);		
			Object obj = hm.get(to);		
			if(obj != null){		
				PrintWriter pw = (PrintWriter)obj;	
				pw.println(id + " ¥‘¿Ã ¥Ÿ¿Ω¿« ±”º”∏ª¿ª ∫∏≥ªºÃΩ¿¥œ¥Ÿ. :" + msg2);	
				pw.flush();	
			} // if	
		}		
	} // sendmsg			
	public void broadcast(String msg){			
		synchronized(hm){		
			Collection collection = hm.values();	
			Iterator iter = collection.iterator();	
			while(iter.hasNext()){	
				PrintWriter pw = (PrintWriter)iter.next();
				pw.println(msg);
				pw.flush();
			}	
		}	
		
			
	} // broadcast
	public void printlist(){
		synchronized (hm){
			Collection collection = hm.keySet();
			Iterator iter = collection.iterator();
			Object obj = hm.get(id);		
			if(obj != null){		
				PrintWriter pw = (PrintWriter)obj;	
				while(iter.hasNext()){
					String id = (String)iter.next();
					pw.println(id);
				}
			}
		}
	}			
}				
