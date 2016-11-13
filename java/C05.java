package dldl;
import java.util.Scanner;
public class C05 {
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하시오.");
		int month = s.nextInt();
		System.out.print("일을 입력하시");
		int day = s.nextInt();
		int daycount = 0;
		if(month >= 1){
			daycount += day; 
			
		}
		if(month >= 2){
			daycount += 31; 
			
		}
		if(month >= 3){
			daycount += 28; 
			
		}
		if(month>= 4){
			daycount += 31; 
			
		}
		if(month >= 5){
			daycount += 30; 
			
		}
		if(month >= 6){
			daycount+= 31; 
			
		}
		if(month >= 7){
			daycount += 30; 
			
		}
		if(month >= 8){
			daycount +=31; 
			
		}if(month >= 9){
			daycount += 31; 
			
		}if(month >= 10){
			daycount +=30; 
			
		}if(month >= 11){
			daycount += 31; 
			
		}if(month >= 12){
			daycount += 30; 
		
		}
		System.out.print("이 날짜는 1년 중 "+ daycount + " 입니다.");
		
	}	
	
	public static void main(String[] args){C05 c  =new C05();
	c.run();
	}
	
	
}
