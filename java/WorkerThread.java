package dd;

class WorkerThread extends Thread {
	SharedPrinter p; 
	// 공유 프린터 주소 
	String [] text; 
	WorkerThread(SharedPrinter p, String[] text) { 
		this.p = p; 
		this.text = text;
		} // 스레드는 반복적으로 공유 프린터에 10번 접근 text[] 출력
	public void run() {
		for (int i=0; i<text.length; i++)
		p.print(text[i]); // 공유 프린터에 출력
		// 한 줄씩 출력 
		
	}
}