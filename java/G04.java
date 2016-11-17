package dd;
import java.util.Scanner;
public class G04 {
	void run(){
		Scanner s = new Scanner(System.in);
		int kind;
		int money;
		int charge = 0;
		int  total_charge = 0;
		boolean AA = true;
		while(true){
			System.out.println(" 부동산 거래종류(1: 매매 2: 임대 0: 계산종료)를 입력하세오.");
			kind = s.nextInt();
			
			switch(kind){
			case 1: System.out.println(" 부동산 거래금액을 입력하세오." );
			money = s.nextInt();
			if(money < 50000000){
				charge = money *  6 / 1000;
				
			}else if(money>=50000000 && money < 200000000){
				charge = money * 5 / 1000;
				
			}else{
				charge= money * 4 /1000;
			}
			System.out.println("거래금액은 :  " + charge);
			total_charge = total_charge + charge;
			break;
			
			case 2:
				System.out.println(" 부동산 거래금액을 입력하세오." );
				money = s.nextInt();
				if(money < 20000000){
					charge = money *  5 / 1000;
					
				}else if(money>=20000000 && money < 500000000){
					charge = money * 5 / 1000;
					
				}
				else if(money>=50000000 && money < 100000000){
					charge = money * 4 / 1000;
					
				}else{
					charge= money * 3 /1000;
				}
				System.out.println("거래금액은 :  " + Math.round(charge )+ " 원 입니다.");
				total_charge =Math.round( total_charge + charge);
				break;
				
			case 0 :
				AA = false;
				break;
			}
			
			System.out.println("지금까지의 수수료 총액:" + total_charge );
			
			
		}
	
		
	}
	public static void main(String[] args){
		G04 g = new G04();
		g.run();
	}

}
