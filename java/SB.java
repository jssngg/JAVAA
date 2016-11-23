package dd;
import java.util.Scanner;
public class SB {
	void run(){
		StringBuffer sb = new StringBuffer("0123");
		System.out.println(sb);
		sb.append("456789012" );
		System.out.println(sb);
	sb.insert(11, "0123");
	System.out.println(sb);
	sb.replace(3, 10, "456");///오오 이게 그 공간 안 쓰면소멸 오오오 
	System.out.println(sb);
	}
	public static void main(String[] args){
		SB s = new SB();
		s.run();
	}

}
