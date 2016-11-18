package dd;
import java.util.Scanner;
public class H06 {
void run(){
	Scanner s= new Scanner (System.in);
	int number[] = new int[5];
	int pow_value[][] = new int[5][5];
	int max=0,min=0;
	int max_a=0,max_b=0;
	int min_a=0,min_b=0;
	int i,j;
	System.out.println("2와 9사이의 숫자 5개를 입력하세요.");
	for(i =0 ; i<5; i++){
		number[i] = s.nextInt();
		if(number[i]>9 || number[i] <2){
			System.out.println("다시입력하세요,범위가 범위가!!!!틀렸단 말이야");
			i--;
		}
	for( j=0; j<i; j++){
		if(number[i] == number[j]){
		System.out.println("중보옹ㅋ옹ㅋ옥옥");
			i--;
		}
	}
	}
System.out.println(" 입력하신 5개의 수로 제곱수를 만들면..." );

for(i=0; i<5;i++){
	for(j=0; j<5; j++){
		pow_value[i][j] = 1;
	for(int k = 0; k < number[j];k++ ){
		pow_value[i][j] *= number[i];
	}
	}
}
for(i=0; i<5;i++){
	for(j=0; j<5; j++){
System.out.println(number[i]+"  " + number[j] +"  " +  pow_value[i][j]);
	}
}
for(i=0; i< 5; i++){
	for(j=0;j<5;j++){
	if(pow_value[max_a][max_b] < pow_value[i][j]){
		max_a = i; max_b = j; max = pow_value[max_a][max_b];
	}
	
		}
		}
System.out.println("가장 큰 5개 수 조합은 " 
		+ number[max_a] + "를 " +number[max_b]+ "번 곱한 " +max + "이다.");
}

	
	

public static void main(String [] args){
	H06 h= new H06();
	h.run();
}
}
