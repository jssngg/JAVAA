package dldl;
import java.util.Scanner;
public class D3 {
	void run(){
		Scanner s = new Scanner(System.in);
		int num = 0;
		int num_minus = 0;
		while(true){
		System.out.print("숫자를 입력하세요.");
		int number = s.nextInt();
		if(number > 0){
			num++;
		}else if(number < 0){
			num_minus ++;
		}else{
			break;
		}
		
		}
		System.out.print("양수" +num + " 음수는 " + num_minus +"번 입니다.");
		
		
	}
	public static void main(String[] args){
		D3 d =new D3 ();
		d.run();
	}

}
