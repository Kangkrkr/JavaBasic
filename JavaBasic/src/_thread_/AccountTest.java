package _thread_;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account(2500);
		
		BankUser user1 = new BankUser(account, "강승윤");
		BankUser user2 = new BankUser(account, "김영두");
		BankUser user3 = new BankUser(account, "백승욱");
		
		user1.start();
		user2.start();
		user3.start();
	}

}
