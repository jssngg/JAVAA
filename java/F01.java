package dldl;
import java.util.Scanner;
public class F01 {
	void run(){
		Scanner s= new Scanner(System.in);
		int num[] = new int [10];
		int first = 0;
		int second = 0;
		int second_max_index = 0;
		for(int i = 0; i < 10 ; i++){
		System.out.print(i+1 + "번째 수를 입력하시오.");
		int newnum = s.nextInt();
		num[i] = newnum;
		if(num[i] > first){
			first = num[i];
			
		}else if(num[i]> second && second < first){
			second  = num[i];
			second_max_index = i + 1;
		}
		}
		System.out.print("첫 번째로 큰 수는 " + first + "이고 "+
		"2번째로 큰 수는 "+ second_max_index +"번째 수인 "+ second );
	}public static void main(String [] args){
		F01 f= new F01();
		f.run();
	}

}
