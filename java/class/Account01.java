
class Account01 {
	String accountNo;
	String ownerName;
	int balance;
	//������
	Account01(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	//�޼ҵ�..�Ա�
	void deposit(int amount) {
		balance += amount;
	}
	//�޼ҵ�..��� �ܾ׺��� ��ü �������
	int withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("�ܾ� ����");
		balance -= amount;
		return amount;
	}
}
