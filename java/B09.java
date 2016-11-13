package dldl;
import java.util.Scanner;
public class B09 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("신장을 입력하세요.");
	int height = s.nextInt();
	System.out.print("체중을 입력하세요.");
	int weight = s.nextInt();
	
	int bmi = Math.round(height / (weight * weight));
	
	if (bmi >= 25 ){
		System.out.print("당신은비만입니다.");
	}
	else{
	System.out.print("당신은 비만이 아닙니다.");
	}
	}
	public static void main (String []args ){
		B09 b = new B09();
		b.run();
	}

}
