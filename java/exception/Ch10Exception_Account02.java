
public class Ch10Exception_Account02 {
	private long balance;
	
	public Ch10Exception_Account02() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws Ch10Exception01 {
		if(balance < money) {
			throw new Ch10Exception01("�ܾ� ����" + (money - balance) + "���ڶ�");
		}
		balance -= money;
	}
}
