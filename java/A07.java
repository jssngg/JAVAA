package dldl;
import java.util.Scanner;
public class A07 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요");
		int kor = s.nextInt();
		System.out.print("영어점수를 입력하세요.");
		int eng = s.nextInt(); //영어점수
	System.out.print("수학점수를 입력하세요");
	int math = s.nextInt(); //수학점수
	int total = kor + eng + math;
	double avg = Math.round( (total)/3.0);
	System.out.print("입력하신 점수의 총점은 " + (total) + "이고 평균은 " + avg+ "입니다.");
	
	
	
	}
public static void main (String [] args){
	A07 a =new A07();
	a.run();
}

}
