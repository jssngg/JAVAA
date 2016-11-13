package dldl;
import java.util.Scanner;
public class A03 {
	void run(){
		Scanner s =new Scanner(System.in);
		System.out.print("섭씨 온도를 입력하세요.");
		double c_degree = s.nextDouble();
		double f_degree = c_degree * 1.8 + 32 ;
		System.out.println(" 화씨온도는 " + f_degree + "도 입니다.");
		
	}
public static void main(String [] args){
	A03 a =new A03();
	a.run()
	;
			
}

}
