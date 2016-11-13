package dldl;
import java.util.Scanner;
public class A08 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("파일 용량을 기가바이트 단위로 입력하세요.");
		int gigabytes= s.nextInt();
		int megabytes = gigabytes * 1024;
		int kilobytes = megabytes * 1024;
		long bytes = kilobytes * 1024;
		System.out.print("입력하신 파일 용량은 \n" + megabytes + "메가바이트 \n"
				+ kilobytes + "킬로바이트 \n " + bytes + "바이트입니다.");
		
	}
public static void main(String[] args){
	A08 a = new A08();
	a.run();
	
}

}
