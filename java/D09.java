package dldl;
import java.util.Scanner;
public class D09 {
	void run(){
		Scanner s= new Scanner(System.in);
		while(true){
		System.out.println(" 출력하고 싶은 구구단의 단 수를 입력시오 (2-9)");
		int a = s.nextInt();
		if (a<2 || a> 9){
			System.out.println
			("잘못입력했습니다.");
		}else{
			
			
		for(int i = 1; i<= 9; i++){
			int result = a  * i;
			System.out.println( a + "x"  + i + " = " + result);
			
		}
		
			
		}break;
			}
	}
	public static void main(String[] args){
		D09 d =new  D09();
		d.run();
	}

}
