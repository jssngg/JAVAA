package dd;

import java.util.Random;
import java.util.Scanner;
public class H02 {
void run(){
	int aa[] = new int[6];
	Scanner s = new Scanner(System.in);
	Random gener = new Random();
	boolean what = true;
	while(what == true){
	System.out.println(" 원하는 범위를 입력하세요." );
	int m = s.nextInt();
	for(int i = 1; i <7; i++){
		int number = gener.nextInt(m) + 1;
		for(int j= 0 ; j <i-1; j++){
			if(number == aa[j]){
				
			i--;
			}else{ aa[i-1] = number;}
		}
		
		
		System.out.print( number + ",");
	}
	System.out.println(" 더 만드시겠습니까? y/n");
	String the = s.next();
	if(the.equals("y")){
		;
	}else{
		what = false;
		System.out.println("bye");
	}
	}
}
public static void main(String[]args){
	H02 h =new H02();
	h.run();
}
}
