import java.util.Scanner;

public class Sangpum01 {
	//code ��ǰ�ڵ� name ��ǰ�� price �ܰ� amount ���� totalP �ݾ�
	//input() ��ǰ�ڵ�, ��ǰ��, �ܰ�, ���� �Է�
	//process() �ݾ�= ����*�ܰ�
	//output() ��ǰ�ڵ�, ��ǰ��, �ܰ�, ����, �ݾ� ���
	//1
	String code, name;
	int price, amount;
	int totalP = 0;
	
	//2 ������
	Sangpum01() {
		
	}
	
	//3 �޼ҵ�
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
		
		System.out.println();
		//������ ���� false
		return false;
			}	
	void process() {
		totalP = amount * price;
	}
	void output() {
		System.out.printf("%4s     %4s    %6d       %5d      %8d\n",
				code, name, amount, price, totalP);
	}
	
}
