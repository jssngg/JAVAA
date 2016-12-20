import java.net.*;				
import java.io.*;				
import java.util.*;
import java.text.SimpleDateFormat;

				
public class ChatServer {				
				
	public static void main(String[] args) {			
		try{		
			ServerSocket server = new ServerSocket(10001);	
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
    
    //시간 표기1
    Date day = new Date();
    SimpleDateFormat now = new SimpleDateFormat("[ hh시 mm분 ss초  ]");
    
    
    
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
				if(line.indexOf("/to ") == 0){	
					sendmsg(line);
				}else	//시간표기2
					broadcast(now.format(day) + id + " : " + line);
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
                //시간표기3
				pw.println(now.format(day) + id + " ¥‘¿Ã ¥Ÿ¿Ω¿« ±”º”∏ª¿ª ∫∏≥ªºÃΩ¿¥œ¥Ÿ. :" + msg2);
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
}




/* 1. ChatClient에서  InputThread를 사용하는 이유는 서버에서 전달받은 문자열을 모니터에 출력하기 위한 것이다. InputTread 객체를 만들어 sock br을 받아, 실행하면 되는데
서버에서 전달받는 문자열이 null이  아니면 출력한다. 와일루프를 돌기 때문에 계속 반복되지만 /quit이면 finally로 가서 버퍼드리드와 소켓을 종료한다.*/

/*2.broadcast 에선 collection객체를 만들어  hm의 value값을 모두 출력하고 , iterator로  컬렉션에 저장된 발루들을 읽는데 , 더 읽어올 요소가 있으면  true를 반환한다.  넥스트를 불러서 그것에 해당하는 printWriter를 가져온다.
sendmsg에선 /아이디의 까지의 정보가 해시맵에 있는지 없는지를 본다. 있으면 프린트라이터를 가져온다. */


/* 3. 심플데이트포맷과 date기능을 import하고  hh - mm - ss 형식을 설정한 뒤에  sendmsg와 brodcast 의 아이디 + 메세지 앞에 넣어준다.  */




