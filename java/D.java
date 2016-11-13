package dldl;
import java.util.Scanner;
public class D {
	void run(){
		Scanner s = new Scanner(System.in);
		int total= 0;
		while (true){
			
		System.out.println("숫자 하나를 입력하시오.0을 입력하면 끝");
		int number = s.nextInt();
		System.out.println("숫자는 " + number);
		
		total = total + number;
		System.out.println("토탈은 " + total);
		if (number == 0){
			break;
		}
		}
	}
public static void main(String[] args){
	D d = new D();
	d.run();
}

}
