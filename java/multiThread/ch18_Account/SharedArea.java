package ch18_Account;

public class SharedArea {
	Account account1; //Lee
	Account account2; //Sung
//�ι�° synchronized
	//������ü
	void transfer(int amount) {
		synchronized (this) {
			account1.withdraw(1000000);
			System.out.print("Lee account: 100���� ����, ");
			account2.withdraw(1000000);
			System.out.println("Sung account: 100���� �Ա�");
		}//synchronized
	}//transfer
	//�ܾ� �հ�
	int getTotal() {
		synchronized (this) {
			return account1.balance + account2.balance;
		}//synchronized
	}//getTotal
}//end


