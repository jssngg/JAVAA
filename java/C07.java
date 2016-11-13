package dldl;
import java.util.Scanner;
public class C07 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("파일 용량 을 메가방트 단위로 입력하세요.");
		int megabytes = s.nextInt();
		
		long bytes = megabytes * 1024 * 1024;
		double time = 0;
		
		System.out.print("전송벙삭울 압력하세요. 1.wifi 2.Bluetooth 3.LTE 4.USB");
	byte kind = s.nextByte();
	if(kind ==1 ){
		time = Math.round(bytes / 1500000.0); 
	}
	else if(kind ==2 ){time = Math.round(bytes / 3000000.0);}
	else if(kind ==3 ){time = Math.round(bytes / 10000000.0);}
	else{ time = Math.round(bytes / 60000000.0);}
	
	
	System.out.print("파일 전송시간은 " + time + "입니다.");
	}
	
public static void main(String [] args){
	C07 c =new C07();
	c.run();
}
}//12.0 이 나옴  12.2 를 

