package dd;
import java.util.Scanner;
public class F05 {
void run(){
	Scanner s =new Scanner(System.in);
	int count=0;
	int bmilist[][] = new int[10][3];
for(int i = 0; i<10; i++){
	System.out.println( i+1 + "번째 사람의 신장과 체중을 입력하시오.");
	int height = s.nextInt();
	bmilist[i][0] = height;
	int weight = s.nextInt();
	bmilist[i][1] = weight;
	int bmi= Math.round(weight/ (height * height/10000)) ;
	bmilist[i][2] = bmi;
	
	if(bmi>25){
		count++;
	}
}
for(int i = 0; i < 10; i++){
	System.out.println(bmilist[i][2]);
	if (bmilist[i][2] > 25){
		System.out.println(i+1 + "번째 사람이 비만입니다.");
	
	}
	
}System.out.println("총 " + count + "명의 사람이 비만입니다.");
}
public static void main(String []args){
	F05 f = new F05();
	f.run();
	
}
}
