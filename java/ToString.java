package dd;

import java.awt.Point;

public class ToString{
	public static void main(String[] args){
		Point a = new Point (2,3);
		System.out.println(a.toString());
		System.out.println(a);//a is changed as a.toString()
	}
}