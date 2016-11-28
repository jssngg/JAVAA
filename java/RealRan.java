package dd;
import java.util.Scanner;
import java.util.Random;
public class RealRan {
	void run(){
		Scanner s = new Scanner(System.in)
;		boolean a = true;
		while(a = true){
		for(int x= 0; x<10; x++){
			int n = (int)Math.random()*100 + 1;
			System.out.println(n);
			
			Random r= new Random();
			int na = r.nextInt(44909);System.out.println(na);
			
			a= false;
			System.out.println("Keep go? y/n ");
			String ak = s.next();
			System.out.println(Math.exp(3));
			
			if(ak.equals("y")){
				continue;
			}else{
				a= true;
				break;
			}
			
		}

		}
		
	}
	public static void main(String [] args){
		RealRan v = new RealRan();
		v.run();
	}
}
