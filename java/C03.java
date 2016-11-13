package dldl;
import java.util.Scanner;
public class C03 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로크기를 입력하시오.");
		int width= s.nextInt();
		System.out.print("직사각형의 세로크기를 입력하시오");
		int height = s.nextInt();
		if(width > height){
			if (width >= 2 * height){
		System.out.print("좌우로 길죽한 직하각형입니.");
			}else{
				System.out.print("일반적인 가로형 직사각형입니다.");
			}
			
		}else if(width < height){
			
			
			if (height >= 2 * width){
				System.out.print("위아로 길죽한 직하각형입니.");
					}else{
						System.out.print("일반적인 세로형 직사각형입니다.");
					}
			
		}else{
			System.out.print("정사각형입니다.");
		}
		
	
	}public static void main (String[] args){
		C03 c = new C03();
		c.run();
		
	}

}
