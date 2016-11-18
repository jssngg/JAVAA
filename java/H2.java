package dd;
import java.util.Random;
import java.util.Scanner;
public class H2 {
void run(){
	int aa[] = new int[6];
	Scanner s = new Scanner(System.in);
	Random gener = new Random();
	System.out.println(" 원하는 범위를 입력하세요." );
	int m = s.nextInt();
	for(int i = 1; i <7; i++){
		int number = gener.nextInt(m) + 1;
		for(int j= 0 ; j <i-1; j++){
			if(number == aa[j]){
				System.out.println(" 중복 경험함 ㅋ " + number );
			i--;
			}else{ aa[i-1] = number;}
		}
		
		
		System.out.println(i  + "번째 숫자는 : " + number);
	}
}
public static void main(String[]args){
	H2 h =new H2();
	h.run();
}
}
