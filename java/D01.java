package dldl;
import java.util.Scanner;
public class D01 {
void run(){
	Scanner s = new Scanner(System.in);
	System.out.print("숫자를입력하세요.");
	int num = s.nextInt();
	int count = 0;
	int a  = 0;
	System.out.println("1부터 " + num + "까지 더해보면 ");
	while(num > count){
		count++;
		a= a + count;
	System.out.print(count + "+ ");
		
		
	}
	System.out.print(" 0 = ");
	System.out.print(a);
}
public static void main(String[] args){
	D01 d = new D01();
	d.run();
}
}
