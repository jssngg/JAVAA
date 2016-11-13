package dldl;
import java.util.Scanner;
public class C06 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요.");
		int kor = s.nextInt();
	
	System.out.print("영어점수를 입력하세요.");
	int eng = s.nextInt();
	System.out.print("수학점수를 입력하세요.");
	int math = s.nextInt();
	int total =kor + math + eng;
	double avg = Math.round(total/3);
	
	System.out.print("입력하신 점수의 총점은 " + total +"이");
	System.out.print("입력하신 점수의 평균은 " + avg + "입니다.");
	if (avg >= 90)
	{
		System.out.print("우입니다.");
	}
	if (avg >= 80)
	{
		System.out.print("미입니다.");
	}
	if (avg >= 70)
	{
		System.out.print("양입니다.");
	}}
	public static void main(String [] args){
		C06 c =new C06();
		c.run();
	}

}
