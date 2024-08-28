package Java;

public class SBIAccount {
	String accNo;
	int balance;
	String name;
	
	
	public SBIAccount(String accNo, int balance, String name) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
	}
	
	void deposit(int amount) {
		
		balance = balance + amount;
		System.out.println("Successfully deposited Amount...."+amount);
		
	}
	
	void withDraw(int amt) {
		
		balance = balance - amt;
		System.out.println("Successfully withdrawn amount....."+amt);
	}
	
	void checkbalance() {
		
		System.out.println("From Account.."+name+"..Current Available Balance--->"+balance);
	}

	

}
