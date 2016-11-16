package dd;
import java.util.Scanner;
public class G02 {
	void run(){
		Scanner s = new Scanner(System.in);
		int input ;
		double degrees[]  = new double[10];
		String degree_name[] = {"냉수" , "온수" , "끓는물"};
		int count[] = {0,0,0};
		int i ;
		int sel;
		for(i = 0 ; i<10; i++){
		System.out.println( i + "번째 물의 온도를 입력하시ㅗ.");
		degrees[i] = s.nextInt();
		
		}
		for(i=0; i<10; i++){
			System.out.println( i + "번째 물의 온도 : ."+ degrees[i]);
		if(degrees[i] > 90){
			count[2] = count[2] + 1;
		}else if(degrees[i]<= 90 && 30 < degrees[i]){
			count[1] = count[1] + 1;
		}else{
			count[0] = count[0] + 1;
		}
		System.out.println(count[0]+"   " +  count[1] + "    "+count[2]);
			
		
			
			}
	}
	public static void main(String [] args)
	{
		G02 g = new G02();
		g.run();
	}
}
