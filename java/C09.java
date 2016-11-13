package dldl;
import java.util.Scanner;
public class C09 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("첫번쨰 숫잘르 입력하세요.");
		int num1  = s.nextInt();
		System.out.print("두번쨰 숫잘르 입력하세요.");
		int num2  = s.nextInt();
		System.out.print("세번쨰 숫잘르 입력하세요.");
		int num3  = s.nextInt();
		int max = 0;
		int min = 0;
		
		if(num1>=num2){
			max = num1;
			min = num2;
			if(num2>=num3){
				min = num3;
			}
			else{
				if(num3 >= num1){
					max = num3;
				}
			}
		}else if(num1<num2){
			max = num2;
			min = num1;
			if(num2<num3){
				max = num3;
			}else{
				if(num3< num1){
					min = num3;
				}
			}
		}
		System.out.println("가장 큰 수는  " + max + "이고 ");
		System.out.println("가장 작은 수는 " + min + "입니다.");
	}
	public static void main(String[] args){
		C09 c =new C09();
		c.run();
	}

}
