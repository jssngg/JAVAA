package dd;

public class BM2 {
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;

	public class BookObjectOutputTest{

		public static void main(String[] args) {
			FileOutputStream fout = null;
			ObjectOutputStream oos = null;

			ArrayList list = new ArrayList();
			Book b1 = new Book("a0001", "자바완성", "홍길동" , 10000);
			Book b2 = new Book("a0002", "스트럿츠", "김유신", 20000);
			Book b3 = new Book("a0003"," 기초 EJB", "김성박", 25000);
			list.add(b1);
			list.add(b2);
			list.add(b3);
			 
			try{
				fout = new FileOutputStream("booklist.dat");
				oos = new ObjectOutputStream(fout);
				
				oos.writeObject(list);
				oos.reset();
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
	} // class end

	
	
	
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.util.ArrayList;

	public class BookObjectInputTest{

		void start() {
			FileInputStream fin = null;
			ObjectInputStream ois = null;

			try{
				fin = new FileInputStream("booklist.dat");
				ois = new ObjectInputStream(fin);
				
				ArrayList list = (ArrayList)ois.readObject();
				Book b1 = (Book)list.get(0);
				Book b2 = (Book)list.get(1);
				Book b3 = (Book)list.get(2);
				ArrayList list2 = (ArrayList)ois.readObject();
				Book b4 = (Book)list2.get(1);
				
				System.out.println(b4.toString());
				System.out.println(b1.toString());
				System.out.println(b2.toString());
				System.out.println(b3.toString());
				
			}catch(Exception ex){
			}finally{
				try{
					ois.close();
					fin.close();
				}catch(IOException ioe){}
			} // finally
		} 
		
		public static void main(String[] args){
			B
			a.start();
		}// main end
	} // class end
	
}
