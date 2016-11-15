package dd;
import java.util.Scanner;
public class F03 {
void run(){
	Scanner s = new Scanner(System.in);
	int jumsu[][] = new int [5][3];
	int sum[] = new int[3];
	double average[] = new double[3];
	int kor, eng,mat;
for(int i = 0; i < 5;i++ ){
	System.out.print(i+1 + " 학생의 국어 영어 수학 점수를 입력하시오.");
	jumsu[i][0] = s.nextInt();
	jumsu[i][1] =s.nextInt();
	jumsu[i][2]= s.nextInt();
	
	
	kor = jumsu[i][0];
	eng = jumsu[i][1];
	mat = jumsu[i][2];
	
}
for(int j=0; j<3; j++){
	for(int i = 0; i<5; i++){
		sum[j] = sum[j] + jumsu[i][j];
	}
	average[j] = Math.round(sum[j]/5);
} 
System.out.print("국어의 총점" + sum[0] + " 평균 " +average[0]);
System.out.print("영어의 총점" + sum[1] + " 평균 " +average[1]);
System.out.print("수학의 총점" + sum[2] + " 평균 " +average[2]);
}
public static void main(String[] args){
	F03 f = new F03();
	f.run();
	
}
}
