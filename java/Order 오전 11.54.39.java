package dldl;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;					// 주문일시 자동입력을 위한 구문 (주문서 생성자 메소드 내)
import java.text.SimpleDateFormat;
import dldl.HFCManager1;// 주문일시 자동입력을 위한 구문 (주문서 생성자 메소드 내)

 class Order{
	int no, price; // 주문일련번호, 총주문가격
	int count[];		// 메뉴별 주문갯수 (count[0]:후라이드 count[1]:양념 ,count[2]:반반 count[3]:파닭 )
	String buyer, date;	//주문자성명, 주문일시(자동입력됨) 
	
	public Order(int n, int p, int c[], String b) // 주문서 생성자.. 수정할 필요 없음  
	{
		this.no = n;
		this.price = p;
		this.count = new int[4];
		for (int i=0;i<4;i++)
		{
			this.count[i] = c[i];
		}
		this.buyer = b;
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, hh:mm:ss"); 
		this.date = sdf.format(dt).toString();
	}
	int getPrice()
	{
		return price;
	}
	int[] getCount()
	{
		return count;
	}
	String getBuyer()
	{
		return buyer;
	}
	String getDate()
	{
		return date;
	}
	void setPrice(int new_price)
	{
		this.price = new_price;
	}
	void setCount(int[] new_count)
	{
			// 구현할 것..
	}

}
