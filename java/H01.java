package dd;
import java.util.Scanner;
import java.util.Random;
public class H01 {
	void run(){
		Scanner s =new Scanner(System.in);
		Random r = new Random();
		
		
		boolean a = true;
		boolean b =true;
		int count=0;
		int total = 0;
		while(b== true){
			int number = r.nextInt(5) + 1;
			count = 0;
			a = true;
		while(a==true ){
			
		System.out.println("1부터 5까지의 숫자 하나를 맞퉈보세요.");
		int wetry = s.nextInt();
		if(wetry < number){
			System.out.println("좀더 큰 수"   );
			count++;
		}else if(wetry > number){
			System.out.println("좀 더 작은 수" );
			count++;
		}else{
			count++;
			System.out.println(count + " 번 만에 숫자를 맞추셨습니다 .");
		System.out.println(" 그만하시겠습니까 y/n ");
		String choose = s.next();
		if(choose.equals("y")){
			a = false;
			b = false;
			total++;
			System.out.println(" total: " + total);
			System.out.println(" 종료." );
			break;
			
		}else{
			total++;
			a=false;
			b= true;
			
			
			}
			
			
		}
		}
		
		}		
	}
public static void main(String[] args){
	H01 h = new H01();
	h.run();
}

}
