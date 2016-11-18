package dd;
import java.util.Scanner;
public class H1 {
	void run(){
		Scanner s = new Scanner(System.in);
		double num[] = new double[10];
		for(int i = 1; i<10; i++){
			System.out.println("숫자를 입력하세요." );
		num[i-1] = s.nextDouble();
		
		}int max_index = 0;

		for(int i = 1 ; i<10; i++)
		{if(Math.abs(num[max_index])< Math.abs(num[i])){
			max_index = i;
			
		}
		}
		System.out.println("입력받은 수의 최대값 : " + num[max_index]);
	}
	public static void main(String []args){
		H1 h =new H1();
		h.run();
	}

}
