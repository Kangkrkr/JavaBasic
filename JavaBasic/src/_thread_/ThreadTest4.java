package _thread_;

public class ThreadTest4 extends Thread {

	public ThreadTest4(String name){
		super(name);
	}
	
	public static void main(String[] args) {

		Thread thread1 = new ThreadTest4("t1");
		Thread thread2 = new ThreadTest4("t2");
		Thread thread3 = new ThreadTest4("t3");
		thread1.start();
		thread2.start();
		thread3.start();

		ThreadTest4 threadTest4 = new ThreadTest4("main");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("main 종료");
	}

	@Override
	public void run() {
		
		for(int i=1; i<=5; i++){
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" : "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" 종료 ");
		
	}
		
}
