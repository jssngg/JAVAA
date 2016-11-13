package dldl;
import java.util.Scanner;
public class B06 {
	void Run(){
		Scanner s = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요>");
		int kor = s.nextInt();
		System.out.print("수학점수를 입력하세요.");
		int math = s.nextInt();
	System.out.print("영어점수를 입력하세요.");
	int eng =s.nextInt();
	int total = kor + eng + math;
	double avg = (Math.round(total/3));
	System.out.print("총점은 " + total +"이고"
			+ "평균점수는 " + avg + "입니다.");
	
	if (kor > 90){
		System.out.print("국어점수가 우수합니다.");
	}
	if (eng > 90){
		System.out.print("영점수가 우수합니다.");
	}
	if (math > 90){
		System.out.print("수점수가 우수합니다.");
	}
	
	}
	public static void main(String[] args){
		B06 b = new B06();
		b.Run();
	}

}
