package dldl;
import java.util.Scanner;
public class A05 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("아프트의 분양 면적을입력하시오.");
		double m2_area = s.nextDouble();
		double pyung_area = m2_area * m2_area / 3.305;
		System.out.println("입력하신아파트의 평형은 " + pyung_area + "입니다.");
		
	}
public static void main(String [] args){
	A05 a =new A05();
	a.run();
}
}
