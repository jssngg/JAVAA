package dldl;
import java.util.Scanner;
public class E1 {
void run(){
	Scanner s= new Scanner(System.in);
	System.out.print("원하는 별단의 수를 입력하세요.");
	int count = s.nextInt();
	for(int i = 1; i<= count ; i++){
		for(int j = 1;j <=i; j++){
			System.out.print("*");
		}
	System.out.println("");
	}
	
}
public static void main(String [] args){
	E1  e = new E1();
	e.run();
}
}
