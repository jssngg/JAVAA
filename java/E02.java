package dldl;
import java.util.Scanner;
public class E02 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("직각삼각형의 높이의 왼쪽 여백의 크기를 입력하시오.");
	
	int  height = s.nextInt();
	int blank = s.nextInt();//왼쪽 여백의 크기 
	
for(int i = 1 ; i <= height ; i++){
	for(int a = 0; a < blank; a++){
		System.out.print(" " );
	}
	for(int j = blank + height - i ; j > blank ; j--){
		System.out.print(" ");
	}for(int k = 1; k <i  ; k++){
		System.out.print("*");
	}
	System.out.println("");
}
	
	}
	public static void main(String [] args){
		E02 e =new E02();
		e.run();
	}

}




