package ch06_test.exam19;

public class Account {
	
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance < 0) {
			return;
		}else if(balance>1000000){
			return;
		}else {
			this.balance = balance;
		}
	}
	
}
