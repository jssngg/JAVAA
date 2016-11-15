package dd;
import java.util.Scanner; 
public class F06 {
void run(){
	Scanner s = new Scanner(System.in);
	int number[][] = new int[5][3];
	int newnum;
	int total = 0;
	int ho;
	int i,j; 
	
for(i = 0; i<5; i++){
	for(j=0;j<3;j++ ){
		System.out.print((i+ 1) + "0" + (j+1 )+ "호에 살고 있는 사람의 숫자를 입력하시오,");
		ho = s.nextInt();
		number[i][j]= ho;
	total = total+ number[i][j];
	}
}
System.out.print("이 아파트에 사는거주자는 모두 " + total );
}         
public static void main(String[]args){
	F06 f = new F06();
	f.run();
}
}
