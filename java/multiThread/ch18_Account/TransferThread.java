package ch18_Account;

public class TransferThread extends Thread {
	SharedArea sharedArea;
	//������
	TransferThread(SharedArea area) {
		sharedArea = area;
	}
	public void run() {
		for (int cnt = 0; cnt < 12; cnt++) {
//			//synchronized�� ����
//			synchronized (sharedArea) {
//			sharedArea.account1.withdraw(1000000);
//			System.out.print("Lee account: 100���� ����, ");
//			sharedArea.account2.withdraw(1000000);
//			System.out.println("Sung account: 100���� �Ա�");
//			}
			//SharedArea�� �������Ƽ� ���� �� �ʿ� ����
			sharedArea.transfer(100);
			}
	}
}
