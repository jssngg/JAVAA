package dldl;
import java.util.Scanner;
public class E06 {
	void run(){
		Scanner  s =new Scanner(System.in);
		System.out.print("출력하려는 행의 크기와 열의 크기를 입력하시오.");
		int row  = s.nextInt();
		int column = s.nextInt();
		for(int i = 1; i <= column ; i++){
			
			for(int j = 1; j <= row ; j++){
				int result =  i * j;
				
				System.out.print(result + "\t");
				
			}
			System.out.println(" ");
		}
		}
	public static void main(String [] args){
		E06 e =new E06();
		e.run();
	}

}
