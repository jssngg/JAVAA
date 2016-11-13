package dldl;
import java.util.Scanner;
public class C04 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의분양면적을 입력하시오.");
		double m2_area = s.nextInt();
		
		double  pyung_area = Math.round(m2_area * m2_area /3.305);
		
	System.out.print("아파트의 평형은 "  + pyung_area +"입니다.");
		
		
		if(pyung_area < 15){
			System.out.print("소형입니다.");
		}else if(pyung_area >= 15&& pyung_area < 30){
			System.out.print("중소형입니다.");
		}else if(pyung_area >= 30 && pyung_area  < 50){
			System.out.print("중형입니다.");
		}else{
			System.out.print("대형입니다.");
		}
	}
	public static void main(String[] args){
		C04 c = new C04();
		c.run();
	}

}
