package ch18;

public class MultiThreadEx03 {

	public static void main(String[] args) {
	//thread ����
		Thread thread = new Thread(new SmallLetters());
	//thread ����
		thread.start();
		char arr[] = { '��', '��', '��', '��', '��', '��', '��', 
					'��', '��', '��', '��', '��', '��', '��' };
		for (char ch : arr) {
			System.out.print(ch);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	  }
	}
}
