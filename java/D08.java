package dldl;
import java.util.Scanner;
public class D08 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("2차 함수 y = ax^2 + bx + c 의 계수 a 와 b,c 를 입력하시오.");
	  
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
	  System.out.print("x좌표의 시작 값과 끝값을 입력하시오." );
	int xb = s.nextInt();
	int  xf = s.nextInt();
	int y= 0;
	
	for(int i =  xb ; i<= xf;i++ ){
		 y = a *i*i + b * i + c;
		System.out.println("좌표 : (" + i + "," + y + ")");
	}
	System.out.print("난 다 보여 주었으으으음 ;;;;");
	
	}
	public static void main(String[] args){
		D08 d =new D08
		();
		d.run();
	}
	

}
