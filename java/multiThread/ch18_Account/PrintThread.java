package ch18_Account;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	//������
	PrintThread(SharedArea area) {
		sharedArea = area;
	}
	public void run() {
		for (int cnt = 0; cnt < 3; cnt++) {
			//synchronized�� ����
//			synchronized (sharedArea) {
//			int sum = sharedArea.account1.balance +
//					sharedArea.account2.balance;
			//SharedArea�� �������Ƽ� ���� �� �ʿ� ����
			int sum = sharedArea.getTotal();
			System.out.println("���� �ܾ� �հ�: " + sum);
			}//for
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch
		}//run
}

