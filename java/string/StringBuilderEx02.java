import java.util.Scanner;

public class StringBuilderEx02 {

	//�ֹι�ȣ �˻��ϱ� 6�ڸ�-7�ڸ� �� 14�ڸ�
	//1 �� 2 �� 3 �� 4 ��
	//123456-1234563 �ֹι�ȣ
	//234567 892345_ ����ġ
	//�� = 1* 2 + 2* 3 + ~ + 6* 5
	//������ = �� / 11
	//üũ����Ʈ: 11 - ������..�ֹι�ȣ �� �� 3�� üũ����Ʈ
	//Integer.parseInt(): ���ڿ�-> ����
		String number;
		int p, q;
		int sum;
		int rest;
		int checkdigit;
		StringBuilderEx02(String number) {
			this.number = number;
		}
		
		
		int length = number.length();
		Scanner in = new Scanner(System.in);
		
		void input () {
		System.out.println("�ֹι�ȣ �Է�: ");
		number = in.next();
		in.close();	
		if (length == 14) {
			System.out.println(number + "(0)");
		} else {
			System.out.println("�ֹι�ȣ �Է� ����");
			}
		}
		
		void process() {
//		sum = ((Integer.parseInt(a) * 2) + (Integer.parseInt(b) * 3) + (Integer.parseInt(c) * 4) +
//				(Integer.parseInt(d) * 5) + (Integer.parseInt(e) * 6) + (Integer.parseInt(f) * 7) +
//				(Integer.parseInt(g) * 8) + (Integer.parseInt(h) * 9) + (Integer.parseInt(i) * 2) +
//				(Integer.parseInt(j) * 3) + (Integer.parseInt(j) * 4) + (Integer.parseInt(k) * 5));
		
		rest = sum % 11;
		
		checkdigit = 11 - rest;
		
		for (p = 0; p < number.length(); p++) {
			if (p == 6)
				continue;
			System.out.println(Integer.parseInt(number.substring(p, p + 1)));
			for (q = 2; q < 10; q++) {
//				System.out.println(Integer.parseInt(number.substring(p, p + 1) * q);
			}
		
			}
		
		}
}
		
		
		



