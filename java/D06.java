package dldl;
import java.util.Scanner;
public class D06 {
	void run(){
		Scanner s = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < 10; i++){
			
		System.out.print("아파트의 분양 면적을 입력하시오.");
		double m2_area= s.nextDouble();
		double pyung_area = Math.round( m2_area*m2_area / 3.305);
	System.out.print("이 아파트의 평형은 " + pyung_area + "입니다.");
		if(pyung_area > 30){
			count1++;
		}else if(pyung_area<= 30){
			count2++;
		}
		
		
		}
		System.out.print("소형아파트의 개수 :" +count2);
	System.out.print("대형 아파트의 개수 : " +count1);
	}public static void main(String[] args){
		D06 d =new D06();
		d.run();
	}

}
