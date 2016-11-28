package dd;
import java.util.Scanner;
import java.util.Random;
public class I2 {
int GetScore(){
	Scanner s = new Scanner(System.in);
	while(true){
		System.out.println();
		System.out.print("점수를 입력하세요,: ");
		int score = s.nextInt();
		if(score >= 0 && score <=100){
			return score;
		}
		System.out.println("Invalid value:");
	}
	
}
public static void main(String [] args){
	I2 z = new I2();
	String classname[] = {"Language" , "Math", "English"};
	int jumsu[] = {0,0,0};
	int sum = 0;
	
	for(int i = 0; i<jumsu.length ; i++){
		System.out.println(classname[i]);
		jumsu[i] = z.GetScore();
		sum += jumsu[i];
		
	}
	double average = sum / 3.0;
	System.out.println(" total : " + sum +" . and  average : "  + average  + " .");
} 

}
