package dldl;
import java.util.Scanner;
public class A02 {
	void run(){
		Scanner s =new Scanner(System.in);
		System.out.println("태어난 년도를 입력하세요.");
		int birth_year = s.nextInt();
		int age = 2016 - birth_year + 1;
		System.out.println("나이는 " + age +"입니다.");
		
	}
public static void main(String [] args){
	A02 a =new A02();
	a.run();
}

}
