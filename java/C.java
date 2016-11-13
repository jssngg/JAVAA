package dldl;
import java.util.Scanner;
public class C {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 2개를 입력하세요.");
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	
	if(num1 > num2){
System.out.print("첫번째숫자가 큽니다.");

		
	}else if(num1 < num2){
		System.out.print("두번쨰 숫자가 큽니다.");
		
	}else {
		System.out.print("두 숫자는 같습니다.");
	}
	}
	public static void main(String[] args){
		C c =new C();
		c.run();
	}

}
