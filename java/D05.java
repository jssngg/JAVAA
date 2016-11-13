package dldl;
import java.util.Scanner;
public class D05 {
	void run(){
		int sq = 0;
		int re1 = 0;//좌우로 2배이상  
		int re2 = 0;//일반적인 좌우
		int er1 = 0;//위아래로 2배이상 
		int er2 = 0 ;//일반적인 위아
		Scanner s = new Scanner(System.in);
		while (true){
		System.out.print("직사각형의 가로크기와 세로크기를 입력하시오.");
		int width = s.nextInt();
		int height = s.nextInt();
		if(width== height){
			System.out.println("정사각형입니다.");
			sq++;
		}if(width > height && width < 2 *  height ){
			System.out.println("일반적으로 가로가 긴 사각형입니다.");
			re1++;
		}if(width >= 2 * height){
			System.out.println("심하게 가로가 긴 사각형입니다.");
			re2++;
		}if(width <  height && 2 * width  > height){
			System.out.println("세로가 긴 직사각형입니다.");
			er1++;
		}if(2 * width <= height){
			System.out.println("심하게 세로가 긴 직사각형입니다.");
			er2++;
		}
		
		
		
		
		if(width<=0 || height <= 0){
			System.out.println("잘못된 숫자를 입력했으니 종료합니다.");
			break;
		}
		}
		System.out.println("정사각형 : " + sq);
		System.out.println("일반적인 가로 사각형 : " + re1);
		System.out.println("심하게 가로가 긴 사각형 : " + re2);
		System.out.println("일반적으로 세로가 긴 사각형 : " + er1);
		System.out.println("심하게 세로가 긴 사각형 : " + er2);
	}
	public static void main(String[] args){
		D05 d =new D05();
		d.run();
	}

}
