package dldl;
import java.util.Scanner;
public class B2 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 나이는?");
		int age = s.nextInt();
		
		System.out.print("당신의 성별은 (M/F)");
		String ge = s.next();
		if (ge.equals("M")){
			System.out.println("당신은 " + age  + "남입니다.");
		}
		else{
			System.out.println("당신은 " + age + "여자입니다.");
		}
	}
	public static void main(String[] args){
		B2 b =new  B2();
		b.run();
	}
	

}
