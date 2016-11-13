package dldl;
import java.util.Scanner;
public class C11 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("년도를 입력하세요.");
		int year = s.nextInt();
		if(year % 4 ==0){
			if(year %100 == 0){
				if(year %400 == 0){
					System.out.print("윤년");
				}
			else{System.out.print(" 평년.");}
			}
			else{
			System.out.print("윤년");}
		}else {System.out.print("평년.");}
	}
public static void main(String[] args){
	C11 c = new C11();
	c.run();
}
}
