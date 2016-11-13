package dldl;
import java.util.Scanner;
public class B01 {
	void run(){
		Scanner s = new Scanner(System.in)
;
		System.out.print("태어난 년도를 입력하세요.");
		int year = s.nextInt();
		int age = 2016 - year + 1;
	
		if(age >= 20){
			System.out.print("미성년자가 아닙니다.");
		}
		else{
			System.out.print("미성년자입니다. ");
		}
		
		}
	public static void main (String [] args){
		B01 b = new B01();
		b.run();
	}

}
