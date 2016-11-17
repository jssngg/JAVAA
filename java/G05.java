package dd;
import java.util.Scanner;
public class G05 {
void run(){
	Scanner s = new Scanner (System.in);
	boolean AA = true;
	int charge = 0;
	int total = 0;
	while(true){
		System.out.println("사용한 시간을 시간과 뿐으로 입력하세오,");
		int hour = s.nextInt();
		
		int minute = s.nextInt();
if(hour == 0 && minute == 0){
			
			System.out.println(" 고객님이 지금까지 이용하신 금액은  " + total + "입니다.");
			AA = false;
			break;
		}
		if(minute >= 60){
			hour++;
			minute = minute - 60;
			
		}
		if(hour < 2){
			if(minute != 0  || minute != 30 || minute != 60){
				charge =Math.round((hour * 60 + minute ) / 30 + 1) * 1000;
			}
			else{
			charge = Math.round((hour * 60 + minute ) / 30) * 1000;}
		}
		if(hour >= 2 && hour < 3){
			if(minute != 0  || minute != 30 || minute != 60)
			{ charge = Math.round((hour * 60 + minute ) / 30 + 1) * 1000 *95 /100;}
			else{
				charge = Math.round((hour * 60 + minute ) / 30 ) * 1000 *95 /100;
			}}
		if(hour >= 3 && hour < 5){
			if(minute != 0  || minute != 30 || minute != 60)
			{ charge = Math.round((hour * 60 + minute ) / 30 + 1) * 1000 *90 /100;}
			else{
				charge = Math.round((hour * 60 + minute ) / 30 ) * 1000 *90 /100;}}
		if(hour >= 5){
			
			if(minute != 0  || minute != 30 || minute != 60)
			{ charge = Math.round((hour * 60 + minute ) / 30 + 1) * 1000 *80 /100;}
			else{
				charge = Math.round((hour * 60 + minute ) / 30 ) * 1000 *80 /100; }
		
		}
	total = total + charge;
		System.out.println(" 고객님의 이용료는 " + charge + "입니다.");
		
	}
		}
			public static void main(String []args){
				G05 g = new G05();
				g.run();
			}}
			
