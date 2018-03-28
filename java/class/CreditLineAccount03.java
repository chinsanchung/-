
public class CreditLineAccount03 extends Account01 {
	
	int creditLine;
	
	CreditLineAccount03(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	//Account01�� �������̵�
	int withdraw(int amount) throws Exception {
		if ((balance + creditLine) < amount)
			throw new Exception("���� �Ұ�");
		balance -= amount;
		return amount;
	}
}
