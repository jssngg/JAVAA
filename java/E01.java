package dldl;
import java.util.Scanner;
public class E01 {
	void run(){
		Scanner s = new  Scanner (System.in);
		System.out.print("정사각형의 크기를 입력하시오.");
		int sq = s.nextInt();
		for(int i = 1; i <= sq ; i++){
			for(int j = 1; j <= sq; j++){
				System.out.print("# ");
			}
			System.out.println("");
		}
	}
	public static void main(String [] args){
		E01 e =new E01();
		e.run();
	}

}
