package _thread_;

public class BankUser extends Thread {

	// false시 출금, true시 입금하는 걸로 한다.
	private boolean flag = false;
	private Account account;
	
	public BankUser(Account account, String name) {
		setName(name);
		this.account = account;
	}

	@Override
	public void run() {
		
		for(int i=1; i<=2; i++, flag = !flag){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			if(flag){	// 입금
				account.deposit((int)(Math.random()*20 + 6) * 100, getName());
			}else{		// 출금
				account.withdraw((int)(Math.random()*20 + 6) * 100, getName());
			}
		}
		
	}
}
