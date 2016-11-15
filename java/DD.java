package dd;


import java.util.Scanner;
public class DD {
	void run(){
	Scanner s = new Scanner(System.in);
 int i;
 int j;
 int jumsu[][] = new int[5][3];
 int sum[] = new int[5];
 
 for(i=0;i<5; i++){
	System.out.println((i+1) + "번 학생의 국 영 수 점수 입력.");
	for(j=0; j<3; j++){
	jumsu[i][j]= s.nextInt();	
	}
sum[i] = jumsu[i][0]+jumsu[i][1]+ jumsu[i][2];

 }
 for(i = 0 ; i < 5; i++){
		System.out.println( (i+1) + "번 학생의 총점은  " + sum[i]);
	}
	} 
	public static void main(String[] args){
		DD d =new DD();
		d.run();
	}

}



