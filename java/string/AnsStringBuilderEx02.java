import java.util.Scanner;

public class AnsStringBuilderEx02 {
	public static void main(String[] args) {
		//w�� ����ġ, remain: ������
		int i, w = 2, checkdigit, sum = 0;
		String num;
		
		Scanner scan = new Scanner(System.in);
		
		//01 �ֹι�ȣ �Է� �˻� ����
		while(true) {
			System.out.println("�ֹι�ȣ �Է� => ");
			num = scan.next();
			
			if(!input_check(num)) {
				System.out.println("�ֹι�ȣ �Է� ����");
				continue;
			} else 
				break;
		}
		// �˻� ��
		
		//2 ��, ������, üũ����Ʈ ���ϱ�
		for (i = 0; i < num.length() - 1; i++) {
			//�߰��� -�� ����
			if (i == 6)
				continue;
			sum += Integer.parseInt(num.substring(i, i + 1)) * w;
			w++;
			//w 9 ������ �ٽ� 2���� �����ؼ� ��
			if (w == 10) 
				w = 2;	 
		//���� sum += (num.charAt(i) - '0') * w
		}
		
		checkdigit = 11 - sum % 11;
		if (checkdigit == 10)
			checkdigit = 0;
		else if (checkdigit == 11)
			checkdigit = 1;
		
		if (checkdigit == Integer.parseInt(num.substring(13, 14)))
			System.out.println("�ֹι�ȣ: " + num + "(0)");
		else
			System.out.println("�ֹι�ȣ: " + num + "(X)");
	}
	
	static boolean input_check(String str) {
		char ch;
		//�Է��� ���ڿ��� 14�ڸ����� �˻�
		if (str.length() != 14)
			return false;
		//���ڿ��� ���޹޾Ƽ� ���ڿ� ���̸�ŭ �� ���ھ� �˻�
		for (int i = 0; i < str.length(); i++) {
			//���ڿ����� �� ���ھ� ����
			ch = str.charAt(i);
			// '-'���� �˻��ϱ�
			if (i == 6) {
				if (ch != '-')
					return false;
			}
			//���� �� �˻�
			else if (i == 7) {
				if (!(ch == '1' || ch == '2' || ch == '3' || ch == '4'))
					return false;
			//ch�� �������� �ƴ��� �����ڵ�� ��
			} else if (ch < '0' || ch > '9'){
				return false;		
			}
		}
		return true;

	}	
}
