package dldl;
import java.util.Scanner;
public class A04 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로크기를 입력하세오.");
		int width = s.nextInt();
		System.out.print("직사각형의 세로크기 를 입력하세요.");
		int height = s.nextInt();
		
		int area = width * height;
		System.out.print("직사각형의 넓이는 " + area + "입니다.");
	}
	public static void main(String [ ] args){
		A04 a = new A04();
		a.run();
	}

}
