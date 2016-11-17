package dd;
import java.util.Scanner;
public class G03 {
	void run(){
		Scanner s = new Scanner(System.in);
		int jumsu[][] = new int[5][3];
			int c_av [] = new int[3];
		String class_na[] = {"국어 ", "영어 ", "수학 "};
		int kor,eng,mat;
		int sum = 0;
		int average,grade;
		int total[] = new int[3];
		int i,j;
		String gr = null;
		for(i=0; i<5;i++){
			System.out.println( (i+1) +"번 생의 국어 영어 수점수는? ");
			kor = s.nextInt();eng = s.nextInt();mat =s.nextInt();
			jumsu[i][0] = kor; jumsu[i][1] = eng; jumsu[i][2] = mat;
		}
		System.out.println("");
		System.out.println("1) 각 과목별 총점과 평균점수 ");
		for(j = 0 ; j<3; j++){
			for(i=0;i<5; i++){
				total[j]= total[j] + jumsu[i][j];
			}
			
		}
		for(j=0; j<3; j++){
			c_av[j] = Math.round(total[j] / 5);
			System.out.println(class_na[j] + "과목의 총점은 " + total[j] + "평균은 "  +  c_av[j]  );
		}
		System.out.println(" " );
		System.out.println(" 2) 학생별 총점과 평균점수" );
		for(i=0 ; i<5 ; i++){
			for(j=0;j<3; j++){
				sum =+  jumsu[i][j];
				
			}
			average = Math.round(sum/3);
		if(average >90){
			gr = "A";
		}else if(average < 90){
		gr = "B";
		}

			System.out.println((i+1) + "번 학생의 총점 :  " + sum  +  "평균점수는 : " +  average    + "    등급: " + gr);
		}
	
		
		
	}
	public static void main(String []args){
		G03 g = new G03();
		g.run();
	}

}
