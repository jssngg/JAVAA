package dd;
import java.util.Random;
import java.util.Scanner;
public class I1 {
;
	void print_header(char ch){
		for(int i = 0; i < 17; i++){
		System.out.print(ch);
		}
		System.out.println();
		System.out.println("쌩성된 로또번호  ");
		for(int i = 0; i < 17; i++){
			System.out.print(ch);
			
			}
		System.out.println();
	}
	
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int lotto[] = new int[6];
		for(int i = 0; i < 6; i++){
			lotto[i] = r.nextInt(45) + 1;
		}
		
		I1  i = new I1();
		
		System.out.println("what ch do you want ? ");
		
		i.print_header('a');
		
		for(int z = 0; z< lotto.length; z++){
			System.out.print(lotto[z] + " ");
		}
		System.out.println("");
		
		
	}

}
