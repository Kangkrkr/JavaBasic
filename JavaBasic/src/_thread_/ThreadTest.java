package _thread_;

public class ThreadTest extends Thread {

	public static void main(String[] args) {
		
		ThreadTest t = new ThreadTest();
		t.start();
		for(int i=1; i<=5; i++){
			try {
				Thread.sleep(1000);
				System.out.println("I'm main - "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void run(){
		for(int i=1; i<=5; i++){
			try {
				Thread.sleep(1000);
				System.out.println("hello main - "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
