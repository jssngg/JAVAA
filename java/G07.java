package dd;
import java.util.Scanner;
public class G07 {
	void run(){
		Scanner s = new Scanner(System.in);
		int team_count;
		int charge[] = {5000,10000,15000,3000};
		
		int v_count[] = new int[4];
		int total_count= 0;
		
		int total_sum=0;
	
		int i,j;
		System.out.println("오늘 방문한 팀 수를 입력하세여.");
		team_count = s.nextInt();
		
		
		int count[] =new int[4];
		int membership = 0;
		for(i = 0;i < team_count; i++){
			int sum =0;
			System.out.println((i+1) + "번 팀의 인원수(초등학생,청소년,일반, 경로대상)을 입력하세요.");
		for(j=0; j<4; j++){
			count[j] = s.nextInt();
			v_count[j] = v_count[j]+ count[j];
			sum = sum +  count[j] * charge[j];
		total_count += count[j];
		}
		System.out.println( (i+1) + "번 팀 할인카드 종류(카드없음 : 0 , 일반등급 :1; 브이엘피등급 :2 )를 입력하세요. ");
	membership =s.nextInt();
	if(membership == 0 ){
		;}
	if(membership == 1 ){
		sum = sum * 9/10 ;}
	if(membership == 2 ){
		sum = sum * 8/10;}
	System.out.println((i+1) + "번 팀 입장료는 " +sum+ "원 입니다."); 
	total_sum += sum;
		
		}
		System.out.println(" 오늘 총 방문자 수는   : " +total_count );
	System.out.println(" 오늘 초등학생  : " + v_count[0]);
	System.out.println(" 오늘 청소년 : " +v_count[1] );
	System.out.println(" 오늘 일반인 : " + v_count[2]);
	System.out.println(" 오늘 경로대상 : " + v_count[3]);
	
	System.out.println(" 총입장료 : " + total_sum);
		
		
	}
	public static void main(String[] args){
		G07 g =new G07();
		g.run();
	}

}

