package dd;
import java.util.Scanner;
public class AAA {
	void run(){
char grade;
Scanner s = new Scanner(System.in);

while(s.hasNext()){
	System.out.println("put your score");
	int score = s.nextInt();
	if(score >= 90){
		grade = 'A';
	}else{grade = 'B';}
	System.out.println(score + ":"+ grade);
}
	}
	public static void main(String[] args){
	AAA a = new AAA();
	a.run();
	}
	}
