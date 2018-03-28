
public class CheckingAccount02 extends Account01 {

	String cardNo;
	CheckingAccount02(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("���� �Ұ�");
		return withdraw(amount); //��ӹ��� withdraw�� ����
	}
}
