package dldl;
import java.util.Scanner;
public class C10 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("숫자1을 입력하세요.");
		int num1 = s.nextInt();
		System.out.print("숫자 2를 입력하세요.");
		int num2 = s.nextInt();
		System.out.print("연산기호문자를 입력하세요(+ - X /)");
		String operator = s.next();
		int result = 0;
		if(operator.equals("+")){
			result = num1 + num2;
		}else if(operator.equals("-")){
			result = num1 - num2;
		}else if(operator.equals("X")||operator.equals("x")){
			result = num1 * num2;
		}else if(operator.equals("/")){
			result = num1/num2;
		}
		System.out.print(num1 + operator + num2 + "=" + result);
		
	}
	public static void main(String[] args){
		C10 c =new C10();
		c.run();
	}

}
