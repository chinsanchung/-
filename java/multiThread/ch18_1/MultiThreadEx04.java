package ch18_1;

public class MultiThreadEx04 {

	public static void main(String[] args) {
		//���� 0.0�� ������ ������ ������1�� 2�� 2�� ���� ����ɽ�
		//����Ʈ�� ���� �ع��� 0.0�� �߰� �� ������ ����� ��
		//�׷��� ������1���� �ϵ��� �����ؾ� ���� ���� p699
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		SharedArea obj = new SharedArea();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread1.start();
		thread2.start();
	}

}
