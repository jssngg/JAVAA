package dldl;
import java.util.Scanner;
public class C02 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("물의 온도를 입력하세요.");
	double degree = s.nextInt();//water's temperature
		if(degree < 0){System.out.println("잘못입력했습니다.");}
		if(degree >= 0 && degree>25){System.out.println("냉수입 니다.");}
		if(degree > 40 && degree >=25){System.out.println("미온수입 니다.");}
		if(degree <= 40 && degree > 80 ){System.out.println("온수입 니다.");}
		if(degree >= 80){System.out.println("끓는물입 니다.");}
	}
	public static void main(String[] args){
		C02 c =new C02();
		c.run();
	}

}
