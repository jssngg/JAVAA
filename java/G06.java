package dd;
import java.util.Scanner;
public class G06 {
	void run(){
	Scanner s = new Scanner(System.in);
		
		
		int total_sale =0;
		int total_order[] = {0,0,0};
		int  price[] = {10000,6000,3000};
		int i;
		System.out.println("세 종류의 제품이 있습니다." );
		System.out.println("1) 가죽장갑 1만원 2)털장갑 6000 3) 비닐장갑 3000" );
		
		boolean AA = true;
		
		while(true){
			int sale=0;
			int order[] = {0,0,0};
			for(i = 0; i< 3; i++){
			System.out.println(( i+1) + " 번 제품은 몇개를 구입하실래요?");
			order[i] = s.nextInt();
			sale += price[i] * order[i];
			total_order[i] += order[i];
		
			}
			if(order[0] == 0 && order[1] == 0 &&order[2] == 0 ){
				AA = false;
				System.out.println("총판매 금액은 " +total_sale + "원 입니다.");
				break;
			}
		
			System.out.println("판매 금액은 " + sale + "원 입니다.");
			total_sale += sale;
		}
	}
	public static void main(String[] args){
		G06 g = new G06();
		g.run();
	}

}
