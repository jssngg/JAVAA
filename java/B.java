package dldl;
import java.util.Scanner;
public class B {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("사과1개의가격을 입력하세요/");
		int unit_price = s.nextInt();
		System.out.print("사과의개수를 입력하세요/");
		int apple_count=s.nextInt();
		
		if(apple_count > 30){
			System.out.println("사과를 다 담을 수 없습니다.")
			;
			
			
		}else{
System.out.println("행복");
		}
		
	}
public static void main (String[] args){
	B b = new B();
	b.run();
}
	

}
