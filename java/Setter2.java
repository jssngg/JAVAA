package dd;
import dd.Setter3;
import dd.Setter;
import java.util.Scanner;
public class Setter2 extends Setter { 
	private String color;
	
	void setColor(String color){
		this.color = color;
		
	}
void showColorPoint(){//color point's print
	System.out.println(color);
	showPoint();
}

}
