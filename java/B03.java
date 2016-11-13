package dldl;
import java.util.Scanner;
public class B03 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오.");
		int width = s.nextInt();
		System.out.print("직사각형의세로크기를 입력하시");
		int height = s.nextInt();
		int area = width * height ;
		System.out.print("직사각형의 넓이는 " + area );
	
		if (width == height){
			System.out.print("정사각형입니다.");
			
		}
		else{
			System.out.print("정사각형이 아닙니다.");
		}
	}
	public static void main(String [] args){
		B03 b = new B03();
		b.run();
	}

}
