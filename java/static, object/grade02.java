
public class Sungjuk02 {
	static int MAX = 100;
	public static void main(String[] args) {
	//���� ��ü �� ��ü�� 100�� ����� �ƴ϶� ���� ��ü �ּҸ� ������ ���۷��� Ÿ�� �迭�� MAX��
		Sungjuk obj[] = new Sungjuk[MAX];
	//���� �����޼ҵ���� �����..Ŭ���� ������ �޼ҵ�� �տ� ��ü�� �ʿ����
		sungjuk_input(obj);
		sungjuk_output(obj);
	}
	
	//�Է��ϴ� ������ �����޼ҵ�� ����..�̶��� obj[]�� obj�� ������ ��ü �ּ�
	//�̸��� ���Ƶ� �� ���� �ȿ����� �����
	static void sungjuk_input(Sungjuk obj[]) {
		int i;
		for (i = 0; i < MAX; i++) {
			obj[i] = new Sungjuk();
			//break�� for�� ��������..�Է� ���̳�
			if (obj[i].input())
				break;
			
			obj[i].process();
			System.out.println();
		}
	}
	//��°����� �����޼ҵ�� ����..main�޼ҵ尡 static�̴� ����ϴ°ŵ� static
	static void sungjuk_output(Sungjuk obj[]) {
		int i;
		System.out.println("\n\t\t      *** ����ǥ ***");
		System.out.println("===========================================================");
		System.out.println("�й�    �̸�    ����    ����    ����    ����    ���    ���");
		System.out.println("===========================================================");
		//for������ �Է��� �͸�ŭ ��������
		for (i = 0; i < Sungjuk.cnt; i++) {
			obj[i].output();
		}
		System.out.println("===========================================================");
		System.out.printf("\t\t\t �� �л��� = %d, ��ü ��� = %5.2f", Sungjuk.cnt, Sungjuk.getTotal());
	}
}
