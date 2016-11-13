package dldl;
import java.util.Scanner;
public class C08 {
	void run(){
		Scanner  s = new Scanner(System.in);
		System.out.print("연봉을 숫자로 입력하세요.");
		int income = s.nextInt();
		int tax =0;
		if (income <10000000){
			tax = income * 95/1000;
		}if (income >= 10000000 && income <40000000){
			tax = income * 190/1000;
		}if (income >= 40000000 &&income < 80000000){
			tax = income * 280/1000;
		}if (income >= 80000000){
			tax = income * 370/1000;
		}
		
		System.out.print("연봉 근액에 대한  소득세는 " + tax +"입니다.");
	}
public static void main (String[] args)
{
	C08 c = new C08();
	c.run();}
}
