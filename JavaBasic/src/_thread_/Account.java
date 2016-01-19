package _thread_;

public class Account {

	private int money;

	public Account(int money) {
		this.money = money;
	}
	
	public synchronized void deposit(int money, String name){
		this.money += money;
		System.out.println(name+" 님이 "+money+" 원을 입금하였습니다.");
		System.out.println("잔금 : "+getMoney());
	}
	
	public synchronized void withdraw(int money, String name){
		
		if(this.money >= money){
								// yield() : 대기중인 다른 스레드들에게 실행권한을 양보하고 이 스레드는 쉰다.
			Thread.yield();		// 잔금이 감소하기전에 스레드가 유휴상태로 들어가버린다. synchronized 가 붙으면 반드시 필요하진않다.
			this.money -= money;
			System.out.println(name+" 님이 "+money+" 원을 출금하였습니다.");
		}else{
			System.out.println(name+" 님이 "+money+" 를 출금하려했으나 잔액이 적어 출금하지 못했습니다.");
		}
		
		System.out.println("잔금 : "+getMoney());
		
	}

	public int getMoney() {
		return money;
	}

}
