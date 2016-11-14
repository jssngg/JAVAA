package dldl;
import java.util.Scanner;
public class E04 {

	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("구구단의 출력모드(1: 홀수단 2 : 짝수단)를 입력하시오.");
	String num = s.next();
	if(num.equals("1")){
		for(int i = 3; i <= 9 ; i = i + 2 ){
			for(int j = 1; j <= 9 ; j++ ){
				int result = j * i;
				System.out.print( i  + " x " + j + " = " +result + "\t\t\t");
				if (j == 3 || j == 6 || j == 9){
					System.out.println(" " );
				}
			}
			System.out.println ("");
		}
	}
	else if(num.equals("2")){
		for(int i = 2; i <= 8 ; i = i + 2 ){
			for(int j = 1; j <= 9 ; j++ ){
				int result = j * i;
				System.out.print( i  + " x " + j + " = " +result +  "\t\t\t" );
				if (j == 3 || j == 6 || j == 9){
					System.out.println(" " );
				}
			}
			System.out.println ("");
		}
		
	}}
	public static void main (String [] arg){
		E04 e =new E04();
		e.run();
	}
	
}
