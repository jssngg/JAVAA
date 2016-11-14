package dldl;
import java.util.Scanner;
public class E022 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("직각삼각형의 높이의 왼쪽 여백의 크기를 입력하시오.");
	
	int  height = s.nextInt();
	int blank = s.nextInt();//왼쪽 여백의 크기 
	
for(int i = 1 ; i <= height ; i++){
	
	for(int j = 0 ; j < blank + height - i ; j++){
		System.out.print(" ");
	}for(int j = 1; j <i  ; j++){
		System.out.print("*");
	}
	System.out.println("");
}
	
	}
	public static void main(String [] args){
		E022 e =new E022();
		e.run();
	}

}




