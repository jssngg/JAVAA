package dldl;
import java.util.Scanner;

public class D10 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("2 개의 숫자를 입력하시오.");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		for(int i = 1; i < 100; i++){
			
			if (i%num1==0 && i%num2 != 0){
				System.out.print(",");
				System.out.println(i);
			}else if(i%num1!=0 && i%num2 == 0){
				System.out.print(",");
				System.out.println(i);}
		}
		
	}
	public static void main(String [] args){
		D10 d =new D10();
		d.run();
	}

}
