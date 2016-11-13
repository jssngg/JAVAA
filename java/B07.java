 package dldl;
import java.util.Scanner;
public class B07 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("파일용량을 메가바이트 단위로 입력하세요,");
		int megabytes = s.nextInt();
		
		long bytes = megabytes * 1024 *1024;
		int time = 0;
		System.out.print("USB포트가 2.0 이면 Y 아니면N 을 입력하세요,");
	String USB2 = s.next();
	if ( USB2.equals("Y")){
		time = Math.round(bytes/ 60000000 );
	}
	else{
		time = Math.round(bytes / 1500000
				);
		
	}
	System.out.print("파일전송시간은 " + time + " 입니다.");
	
	}public static void main(String [] args){
		B07 b = new B07();
		b.run();
	}
}
