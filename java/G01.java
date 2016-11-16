package dd;
import java.util.Scanner;
public class G01 {
	void run(){
		Scanner s = new Scanner(System.in);
		boolean a = true;
		int iy = 0;
		int  count = 1;
		int baby = 0;
		int adult = 0;
		int old = 0;
		int age[] = new int[100];
		int age2=0;
		while(true){
		System.out.println(count + "번째 사람의 테어난 년도를 입력하시오.");
		iy= s.nextInt();
		if(iy > 2016 || count > 100){
			a = false;
			break;
		}
	age[count] = 2016 - iy + 1;
		if(age[count] < 20){
			
			baby++;
		}else if (age[count] >= 20 && age[count]<60){
			adult++;
		}else{
			old++;
		}
		
		
		count++;
		}
		for(int i = 1; i < count;i++){
			System.out.println(i + "번째 사람의 나이는 "  + age[i] );
		}
		System.out.println(" 어린이는 " + baby + " 명이");
		System.out.println("어른은 "+ adult + " 명이고 ");
		System.out.println("노인은 " + old );
	}

	public static  void main (String[] args){
		G01 g = new G01();
		g.run();
	}

}
