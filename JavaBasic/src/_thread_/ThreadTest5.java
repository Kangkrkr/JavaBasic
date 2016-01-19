package _thread_;

public class ThreadTest5 extends Thread {

	public static void main(String[] args) {

		Thread thread1 = new ThreadTest5();
		thread1.setName("t1");
		
		Thread thread2 = new ThreadTest5();
		thread2.setName("t2");
		
		Thread thread3 = new ThreadTest5();
		thread3.setName("t3");
		
		thread1.start();
		thread2.start();
		thread3.start();

		ThreadTest5 threadTest4 = new ThreadTest5();
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
