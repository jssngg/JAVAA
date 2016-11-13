package dldl;
import java.util.Scanner;
public class D1 {
	void run(){
		Scanner s = new Scanner(System.in);
		boolean cl = true;
		while (cl){
		int total= 1;
	System.out.print("양의 정수를 입력하세요,");
	int count = s.nextInt();
	if (count < 0){System.out.print("음수입니다.");}
	
	while (count>0 && count >= total){
		System.out.println(total);
		total++;
	}
	System.out.print("종료하시겠습까 y/n" );
	String check = s.next();
	if (check.equals("y")){
		cl = false;
		System.out.print("종료합니다." );	
		}
		
		}
		
	}
public static void main(String[] args){
	D1 d = new D1();
	d.run();
}
}