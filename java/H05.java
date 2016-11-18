package dd;
import  java.util.Scanner;
import java.util.Random;
public class H05 {
	void run(){
		Random r = new Random();
		Scanner s= new Scanner(System.in);
		System.out.println("사용하실 코인의 개수를 입력하세요.");
		int coins = s.nextInt();
		int number [] = new int[3];
		int count=0;
		
		while(coins>0){
			coins--;
			count++;
			System.out.println("게임 " +count+ " 회 start! 아무거나 숫자누르면 됨  " );
			int dummy= s.nextInt();
			for(int i  =0; i <3; i++){
				number[i] = r.nextInt(9)+ 1;
				}
			
			System.out.println("게임결과 : " +number[0] + "," + number[1] + "." + number[2]+ " 입니다."); 
			if(number[0] == number[1] &&number[1] == number[2] &&number[0] == number[2]){
				System.out.println("숫자 3개 일치 코인 4개 증.");
				coins += 4;
			}else if(number[0] != number[1] &&number[1] != number[2] &&number[0] != number[2]){
				System.out.println("꽝 .");
			}else{
				System.out.println("숫자 2개 일치 코인2개증정 .");
				coins += 2;
			}
			System.out.println("남아있는 코인은" + coins+ " 개입니다."  );
			
			
			
			
			
			
			
			if(coins==0){
				System.out.println("게임종료.");
				break;
			}
		}
	}
public static void main(String[] args){
	H05 h = new H05();
	
	h.run();
}

}



