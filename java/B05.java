package dldl;
import java.util.Scanner;
public class B05 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("날수를 입력하세요,");
		int days = s.nextInt();
		int seconds = days  * 24* 60 *60;
		int m_se = Math.round(seconds/1000000);
		System.out.print("날수에 해당하는 시간은 무려 " + seconds + "초입니다.");
	if (m_se > 0){
		System.out.print("100만초가모두 " + m_se + "입니다.");
	}
	
	}
	public static void main(String [] args){
		B05 b = new B05();
		b.run();
		
	}

}
