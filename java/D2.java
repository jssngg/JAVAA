package dldl;
import java.util.Scanner;
public class D2 {
void run(){
	Scanner s  = new Scanner(System.in);
	System.out.print("숫자를 입력하세요.");
	int num = s.nextInt();
	int count = 0;
	while(num > count){
		count =+ num;
		System.out.print("더하고 있음 " + count);
		
	}
	System.out.println("사실 페이크였고");
	int count2 = 0;
	int sum = 0;
	for(int i = 1; i <= num; i++){
		count2 +=i;
		System.out.println("더하는 합은 " +count2);
		sum = sum+  i;
		
		System.out.println("중간 결론들이다 " + sum);
	}
}
public static void main(String [] args){
	D2 d = new D2();
	d.run();
}

}
