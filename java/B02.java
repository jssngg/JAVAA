package dldl;
import java.util.Scanner;
public class B02 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.println("온도를 입력하세요.");
		int degree = s.nextInt();
		System.out.print("입력하신 온도가 섭씨라면 C를 화씨온도이면F를 입력하세요");
		String choice = s.next();
		double out_put = 0;
		if (choice.equals("C")){
			out_put = degree  * 1.8 +32 ;
		}
		else{
			out_put = (degree - 32) / 1.8;
		}
		System.out.print("변환한온도는 "  + Math.round(out_put) + "입니다.");
	}
	public static void main(String [] args){
		B02 b = new B02();
		b.run();
	}

}
