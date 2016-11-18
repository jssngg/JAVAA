package dd;
import java.util.Scanner;
import java.util.Random;

public class H04 {
void run(){
	Random li = new Random();
	Scanner s = new Scanner(System.in);
	int com_f;
	int my_f;
	String f[] = {"가위 ", "바위" , "보" };
	int score[][] = new int[2][3];
	int i,j;
	boolean C = true;
	while(C==true){
	System.out.println("1: 가위 2: 바위 3:보 를 입력하세요,(0: 종료)");
	my_f = s.nextInt();
	if(my_f ==0){
		C = false;
		System.out.println("종료");
		System.out.println(" computer wins " + score[0][0] + " times looses  " + score[0][1] + "timese  draws " + score[0][2] +"times.");
		System.out.println("User wins " + score[1][0] + " times looses  " + score[1][1] + "timese  draws " + score[1][2] + "times.");
		break;
	}
	com_f = li.nextInt(3)+1;
	System.out.println("당신이 낸 것: " +f[my_f -1]);
System.out.println("컴퓨터가 낸 것은 " + f[com_f -1] + "입니다.");
int result = com_f - my_f;


if(result>  0){
	if(result ==2 ){
		System.out.println("사용자 승");
		score[1][0]+= 1;
		score[0][1]+=1;
	}
	else{System.out.println("컴퓨터 승");
	score[0][0]+= 1;
	score[1][1]+=1;}
}else if(result <  0){
	if(result ==-2 ){
		System.out.println("컴퓨터  승");
		score[0][0]+= 1;
		score[1][1]+=1;
	}
	else{System.out.println("사용자 승");
	score[1][0]+= 1;
	score[0][1]+=1;}
}else if(result== 0){
	System.out.println("비김" ) ;
	score[0][2]+= 1;
	score[1][2]+=1;
	
}



	
	
	
	}
}
public static void main(String []args){
	H04 h = new H04();
	h.run();
}
}
