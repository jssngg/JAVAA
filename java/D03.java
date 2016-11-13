package dldl;
import java.util.Scanner;
public class D03 {
void run(){
	Scanner  s = new Scanner(System.in);
	int max = 0;
	int min = 2000000000;
	boolean a = true;
	int i = 0;
	int sum = 0;
	
	{
	while (true){
	System.out.print("0부터 100까지의 숫자를 입력하세요.");
	int num = s.nextInt();
	sum = sum + num;
	
	if(num > max){
		max = num;
	}if(num < min){
		min = num;
	}if(num<0 || num>100){
		a = false;
		break;
	}
	i++;
	
	
	}
	double avg = Math.round(sum / i);
	System.out.print("입력한 숫자" +i + "개의 총합은 " + sum + "이고 평균값" 
	+ 	avg + "이다."	);
	
	}
 

}
public static void main(String[] args){
	D03 d = new D03();
	d.run();
}
}
