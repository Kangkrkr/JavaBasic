package _thread_;

public class ThreadTest2 extends Thread {

	public static void main(String[] args) {

		ThreadTest2 thread = new ThreadTest2();
		thread.start();
		
		for(int i=1; i<=5; i++){
			try {
				Thread.sleep(1000);
				System.out.println("main - "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main 종료");
	}

	@Override
	public void run() {
		
		for(int i=1; i<=5; i++){
			try {
				Thread.sleep(1000);
				System.out.println("thread - "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("thread 종료");
		
	}
		
}
