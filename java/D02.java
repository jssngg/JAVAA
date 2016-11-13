package dldl;
import java.util.Scanner;
public class D02 {
	void run(){
		Scanner s = new Scanner(System.in);
		int max = 0;
		int min = 2000000000;
		
		int num = 0;
		boolean a = true;
		while(true){
		System.out.print("0부터 100 사이의 숫자를 입력하세요. " );
		num = s.nextInt();
		
		if (num > max){
			max = num;
			
		}if(num < min){
			min = num;
		}
		
		if (num < 0 || num >100){
			a= false;
			break;
		}
		System.out.print("최대 숫자는 " +max + " 이고 " + "최솟값은 " + min +" 입니다. ");
		}
	System.out.print("종료." );
	}
	public static void main(String[] args){
		D02 d = new D02();
		d.run();
	}

}
