package dldl;
import java.util.Scanner;
public class D07 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print(" 1차 함수 y = ax + b 의 계수 a 와 b 를 입력하시오.");
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.print(" x 좌표의 시작 값과 끝값을 입력하시오." );
		int x1 = s.nextInt();
		int x0 = s.nextInt();
		
		for(int i = x1; i<= x0; i++  ){
			int y = a * i + b;
			System.out.println("( 좌표 : "+ i + "," + y + ")");
		}
	}
	public static void main(String[] args){
		D07 d =new D07();
		d.run();
	}

}
