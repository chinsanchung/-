import java.util.Scanner;

public class Ch06Static01 {
	
	String code, name;
	int price, amount;
	int totalP = 0;
	//���� �ʵ� �߰��ϱ�
	static int cnt = 0;
	static int total = 0;
	
	Ch06Static01() {
		
	}
		
	boolean input() {	
		Scanner in = new Scanner(System.in);
		System.out.println("��ǰ�ڵ�: ");
		code = in.next();
		
		if (code.equals("exit")) {
			return true;
		}
		System.out.println("��ǰ��: ");
		name = in.next();
		System.out.println("����: ");
		amount = in.nextInt();
		System.out.println("�ܰ�: ");
		price = in.nextInt();
		
		cnt++;
		//������ ���� false...if������ �ö󰣴�
		return false;
			}	
	//�Է� ������ process�� �Ѿ
	void process() {
		totalP = amount * price;
		total += totalP;
	}
	void output() {
		System.out.printf("%4s     %4s    %6d       %5d      %8d\n",
				code, name, amount, price, totalP);
	}
	//�������� System.out.println(Ch06Static01.total);�� ����Ϸ��� ���� �����޼ҵ�
	static int getTotal() {
		return total;
	}
}
