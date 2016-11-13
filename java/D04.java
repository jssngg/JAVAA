package dldl;
import java.util.Scanner;
public class D04 {
void run(){
	Scanner s = new Scanner(System.in);
	System.out.print("가족이 몇 명인지 입력하세요.");
	int familycount = s.nextInt();//가족이 몇명인지\
	int count_young = 0;
	for(int i = 0; i < familycount; i++){
		System.out.print("태어난 년도를 입력하세요.");
		int year = 2016 - s.nextInt() + 1;
		if(year < 20){
			count_young++;//미성년자를 더함 
		}
		
	}
	System.out.print("미성년자는" +count_young + "명입니다.");
}
public static void main(String[] args){
	D04 d = new D04();
	d.run();
}
}
