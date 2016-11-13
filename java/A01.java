package dldl;
import java.util.Scanner;
public class A01 {
void run(){
	Scanner s = new Scanner(System.in);
	System.out.println("사과의 1개의 가격을 입력하세요." );
	int unit_price = s.nextInt();
	
	System.out.print("사과의 개수를 입력하세요.");
	int apple_count = s.nextInt();
	int price = apple_count * unit_price ;
	System.out.println("사과의 총 금액은 " + price + "입니다.");
	
}
public static void main (String [] args){
	A01 a = new A01();
	a.run();
}
}
