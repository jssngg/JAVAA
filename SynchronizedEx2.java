package dd;


import dd.SynchronizedEx.PrintThread;

public class SynchronizedEx2 {
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter(); // 공유 데이터 생성
	
		PrintThread pt1= new PrintThread(1, 8);
		pt1.start();
		PrintThread pt2= new PrintThread(10, 50);
		pt2.start();
		PrintThread pt3= new PrintThread(100, 300);
		pt3.start();
	}
	

	static class PrintThread extends Thread {
	
		int iv;
		int max;
		
		public PrintThread(int initValue, int max) {
			iv = initValue;
			this.max = max;
		}
		
		public void run() {
			int count = 0;
		
			for (int i= iv; i <= max; i+= iv) {
	
				System.out.println(i + ":" + count);
				try {
					Thread.sleep(100);
					count++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}