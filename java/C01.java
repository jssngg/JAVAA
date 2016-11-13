package dldl;
import java.util.Scanner;
public class C01 {
	void run(){
	Scanner s =new Scanner(System.in);
	System.out.print("태어난 년도를 입력하세요.");
	int year = s.nextInt();
	int age = 2016 - year + 1;
	if (age < 7){
		System.out.print("유아입니다.");
	}else if(age >= 7 && age <13){System.out.print("어린입니다.");}
	else if(age>= 13 && age < 20){System.out.print("청소년 입니다.");}
	else if(age >= 20 && age <30){System.out.print("청년 입니다.");}
	else if(age>= 30 && age < 60){System.out.print("중년 입니다.");}
	else{System.out.print("노년입니다.");}
	}
	public static void main(String[] args){
		C01 c = new C01();
		c.run();
	}

}
