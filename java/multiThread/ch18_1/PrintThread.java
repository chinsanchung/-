package ch18_1;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run() {
	//isReady�� Ʈ��ɶ����� ��Ƽ���ݺ�..Busy Waiting
	//true �߸� ����Ʈ..�� �۾����� ���� �ð� �����
		while(sharedArea.isReady != true)
			continue;
		System.out.println(sharedArea.result);
			
	}
}
