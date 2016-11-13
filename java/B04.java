package dldl;
import java.util.Scanner;

public class B04 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의분양면적제곱미터를 입력하시 오");
		double m2_area = s.nextInt();
	double pyung_area =(double) m2_area * m2_area / 3.306;
	System.out.println("아파트의 평형은 " + pyung_area + "이고 ");
	
	if (pyung_area > 30){
		System.out.print("큰 아파트입니다.");
	}
	else{
		System.out.print("작은아파트입니다.");
	}
	}
public static void main (String [] args){
	B04  b =new B04();
	b.run();
}
}
