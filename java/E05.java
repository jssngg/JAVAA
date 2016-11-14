package dldl;
import java.util.Scanner;
public class E05 {
	void run(){
		Scanner s =new Scanner(System.in);
		System.out.print("구구단의 출력모드(1:홀수단 2: 짝수단)을 입력하세요.");
		int ch =s.nextInt();
		System.out.print("한 줄에 출력할 갯수를  입력하시오.");
		int column = s.nextInt();
		if(ch == 1){
			int a = 9 % column ; 
		
		for(int i = 1; i < 10; i = i + 2){
			for(int j = 1; j <= 9; j++){
			int result = i * j;
			System.out.print( i + "x " + j+ "=" + result  + "\t\t");
			if( j >= column &&(9-a) % j == 0){
				System.out.println("");
				}
			}
			System.out.println("  ");
			System.out.println("  ");
			}
			
		}
		else if(ch == 2){
			int a = 9 % column ; 
			
			for(int i = 2; i < 10; i = i + 2){
				for(int j = 1; j <= 9; j++){
				int result = i * j;
				System.out.print( i + "x " + j+ "=" + result  + "\t\t");
				if( j >= column &&(9-a) % j == 0){
					System.out.println("");
					}
				}
				System.out.println("  ");
				System.out.println("  ");
				}
			
		}
		else{
			System.out.print("범위에 없습니다.");
		}
	}
	public static void main(String [] args){
		E05 e = new E05();
		e.run();
	}

}
