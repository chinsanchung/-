package ch18;

public class MultiThreadEx02 {
	//3���� �����带 �����ؼ� �����մϴ�
	public static void main(String[] args) {
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlphabetThread();
	
		thread1.start(); //2��° ������ ����
		thread2.start(); //3��° ������ ����
		thread3.start(); //4��° ������ ����
	}

}
