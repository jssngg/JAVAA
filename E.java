package dldl;
import java.util.Scanner;
public class E {
void run(){
	Scanner s = new Scanner(System.in);
	System.out.print("원하는 단을 입력하셍요." );
	int dan = s.nextInt();
	for(int i = dan; i <= 9 ; i++){
		System.out.println(i +" 단의 곱셈을 시작합니다.");
		for(int j = 1; j < 10; j++){
			int result = i * j;
			System.out.println(i + "x" + j +" =" + result);
		}
	}
}
public static void main(String []args){
	E e = new E();
	e.run();
}
}
