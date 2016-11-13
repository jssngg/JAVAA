package dldl;
import java.util.Scanner;
public class B08 {
	void run(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번쨰숫자를 입력하세요.");
		int num1 = s.nextInt();
		System.out.print("두번쨰숫자를 입력하시오.");
		 int num2 = s.nextInt();
		 System.out.print("세번쨰 숫자를 입력하세요");
		 int num3 = s.nextInt();
		 if(num1 != num2 && num1 != num3 && num2 != num3 ){ 
		 }
		 else{
			 System.out.print("첫번째 조건 만족 :적어도 두 수의 값이 같다.");	 
			 
		 }
		 if ((num1 > 50 && num2> 50) || (num3 > 50 && num2> 50) ||(num1 > 50 && num3> 50)){
			 System.out.print("두번쨰조건만족" );
		 }
		 
		 if ((num1+num2+num3)/2 == num1 || (num1+num2+num3)/2 == num2 ||(num1+num2+num3)/2 ==num3){
			 System.out.print("3번째조건 만족  ");
		 }
		 if (num1*num2*num3 == num1*num1 ||num1*num2*num3 == num2*num2||num1*num2*num3 == num3*num3){
			 System.out.print("4번째 조건 만족 ");
		 }
		 
		 
	}
	public static void main(String []args){
		B08 b =new B08();
		b.run();
		
	}

}
