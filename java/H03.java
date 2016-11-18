package dd;
import java.util.Scanner;
import java.util.Random;
public class H03 {
void run(){
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	int lotto_com[] = new int[6] ;
	int lotto_u[] = new int[6];
	int i ;
	boolean a1 = false;
	boolean a2 = false;
	int count =0;
	int match_count =0;
	for(i = 1 ; i <= 6; i++){
		 int ac = r.nextInt(45) + 1;
		 for(int j = 0; j < i-1; j++){
			 if(ac == lotto_com[j]){
				 a1 = true;
				 break;
			 }if(a1==true){i--;
			 a1 =false;}
			 else{lotto_com[i-1] = ac;}
		 }
	}
	for(i = 1;  i <= 6; i++){
	System.out.println(i + " 번째 로또 숫자를 입력하세요.");
	int af = s.nextInt();
	for(int j = 0; j < i-1; j++){
		
		 if(af == lotto_u[j] || af > 45 || af< 1)
			{ a2 = true;
				 break;
			 }if(a2==true){i--;
			 a2= false;}
		 else{lotto_u[i-1] = af;}
			 }
	
}
	System.out.println(" 이번주의 로또 당첨번호는 " +lotto_com[0]+","+lotto_com[1]+","+lotto_com[2]+","+lotto_com[3]+","+lotto_com[4]+","+lotto_com[5]);
for(i = 0; i<6; i++){
	if(lotto_com[i] == lotto_u[i]){;
	match_count++;}
}
System.out.println("일치하는 로또 번호는 "  + match_count + " 개입니다.");
}
public static void main(String[] args){
	H03 h = new H03();
	h.run();
	}
}
