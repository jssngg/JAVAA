package dd;
import java.util.*;
import java.io.*;

public class BM {
	ArrayList <B> Bs = new ArrayList();
	Scanner s = new Scanner(System.in);
	void print(){
		System.out.println("1) read 2) search 3) save 4) over");
		
	}
	void print2(){
		System.out.println("1) Author 2) price 3) ISBN 4) title");
	}
	void print3(){
		System.out.println("ISBN\tTitle\tAuthor\tPrice");
	}
	void read(){
		
		
		FileInputStream fin = null;
		ObjectInputStream ois = null;

		try{
			print3();
			fin = new FileInputStream("booklist.dat");
			ois = new ObjectInputStream(fin);
			
			ArrayList list = (ArrayList)ois.readObject();
			B b1 = (B)list.get(0);
			B b2 = (B)list.get(1);
			B b3 = (B)list.get(2);
		
			
			
			System.out.println(b1.toString());
			System.out.println(b2.toString());
			System.out.println(b3.toString());
			
		for(int i=0; i<list.size(); i++)
		{
			Bs.add((B)list.get(i));
		}
			
			
		}catch(Exception ex){
		}finally{
			try{
				ois.close();
				fin.close();
			}catch(IOException ioe){}
		}
	}
	void search_ISBN(){
		System.out.print("Input an ISBN that you want to find:");
	String isbN = s.next();
	print3();
	for(int i = 0 ;i <  Bs.size(); i++){
		if(Bs.get(i).getIsbn().equals(isbN))
		{System.out.println(Bs.get(i).toString());}
		
	}
	}
	void search_Title(){
		System.out.print("Input a title that you want to find:");
		String titlE = s.next();
		
		print3();
		for(int i = 0 ;i <  Bs.size(); i++){
			if(Bs.get(i).getTitle().equals(titlE))
			{System.out.println(Bs.get(i).toString());}
			
		}
	}
	void search_Author(){
		System.out.print("Input an Author that you want to find:");
		String authoR = s.next();
		print3();
		for(int i = 0 ;i <  Bs.size(); i++){
			if(Bs.get(i).getAuthor().equals(authoR))
			{System.out.println(Bs.get(i).toString());}
			
		}
	}
	void search_Price(){
		System.out.print("Input a price that you want to find less one:");
		int pricE = s.nextInt();
		print3();
		for(int i = 0 ;i <  Bs.size(); i++){
			if(Bs.get(i).getPrice() <= pricE)
			{System.out.println(Bs.get(i).toString());}
			
		}
	}
	void save(){
		
		
		
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;

		ArrayList list = new ArrayList();
		B b1 = new B("a0001", "자바완성", "홍길동" , 10000);
		B b2 = new B("a0002", "스트럿츠", "김유신", 20000);
		B b3 = new B("a0003"," 기초 EJB", "김성박", 25000);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		 
		try{
			fout = new FileOutputStream("booklist.dat");
			oos = new ObjectOutputStream(fout);
			
			oos.writeObject(list);
			oos.reset();
		
			
			System.out.println(" 저장되었습니다 .");
			
		}catch(Exception ex){
		}finally{
			try{
				oos.close();
				fout.close();
			}catch(IOException ioe){}
		} // finally
	} // main end
// c
	
	void start(){
		boolean aa = true;
		while(aa = true){
		
			
	print();
	int select1 = s.nextInt();
	if(select1 ==4 ){
		System.out.println("Program Over");
		aa = false;
		break;
	}
	switch(select1){
	case 1 :
		System.out.println("read");
		read();
		break;

	case 2:
	print2();
	int select2 = s.nextInt();
	switch(select2){
		case 1:
			search_Author();
			
			break;
		case 2: 
			search_Price();
			break;
		case 3: 
			search_ISBN();
			
			break;
		case 4: 
			search_Title();
			break;
	}
	
		
		
		
	
		
		break;
	case 3:
		System.out.println("save");
		save();
		break;
	case 4:
		;
		break;
		
	}
		
		}
	}
	
	public static void main(String[] args){
		BM b = new BM();
		b.start();
		
	}
	

}
