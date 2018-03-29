package ch18;

public class MultiThreadEx01 {

	public static void main(String[] args) {
		// DigitThread.java�� ����ϱ� ���� ���⼭ ��ü ����
		Thread thread = new DigitThread();
		//start�� ȣ��� run �޼ҵ� ����
		thread.start();
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);
		//sleep�޼ҵ� ����ó��
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
