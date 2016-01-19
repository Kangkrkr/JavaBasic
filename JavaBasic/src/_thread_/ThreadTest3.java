package _thread_;

public class ThreadTest3 implements Runnable {

	public static void main(String[] args) {

		ThreadTest3 run = new ThreadTest3();
		Thread thread = new Thread(run);
		
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
