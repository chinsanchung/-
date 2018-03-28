import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {

	public static void main(String[] args) {
	//����: ��Ģ���� ����
	Scanner scan = new Scanner(System.in);
	
	int result;
	String str, token_str;
//while�������� ��
input_loop:
	while(true) {
		System.out.println("���� �Է� = ");
		//trim���� ���ʿ��� ���� ����
		str = scan.next().trim();
		scan.close();
		StringTokenizer token = new StringTokenizer(str, "+-*/", true);
		//ù��° ��ū �б�..token_str�� ���� ����(���ڿ��� ��ü�� ����, ���ڴ� �����ڵ�� ����)
		token_str = token.nextToken();
		//input_check ��ū�� �������� �˻�..�� ���� 75���ٷ� �̵�
		if (input_check(token_str)) {
		//true�� �����Է¿���(��ū�� ���ڰ� �ƴ�)
			System.out.println("���� �Է� ���� \n");
		//14���� while(true)�� �̵�
			continue;
		}
		//if���� Ʋ���� �� ��ū�� ���ڷ� ��ȯ..
		//Ŭ����.�޼ҵ� �̷� ������ ����ƽ �޼ҵ�
		result = Integer.parseInt(token_str);
	
		//��ū�� ���� ������ �ݺ�
		while(token.hasMoreTokens()) {
		//¦����° ��ū ����(������)
			token_str = token.nextToken();

		//���ڿ����� ������ ����
			char ch = token_str.charAt(0);
			System.out.println(ch);
			if (token.hasMoreTokens())
		//Ȧ����° ��ū ����(����)
				token_str = token.nextToken();
			else {
		//�����ڷ� ������ ������ ���
				System.out.println("���� �Է� ���� \n");
				continue input_loop;
			}
		//input_check ��ū�� �������� �˻�
			if (input_check(token_str)) {
				System.out.println("���� �Է� ���� \n");
				continue input_loop;
			}
			System.out.println(token_str);
		//p116 switch��
			switch(ch) {
			case '+':
				result += Integer.parseInt(token_str);
				break;
			case '-':
				result -= Integer.parseInt(token_str);
				break;
			case '*':
				result *= Integer.parseInt(token_str);
				break;
			case '/':
				result /= Integer.parseInt(token_str);
				break;
			}  //switch�� ��
		}  //while�� ��
		break;
	}  //while(true)�� ��
	System.out.println(str + "=" + result);		
	}
	
	static boolean input_check(String str) {
		char ch;
		//��ū�� ���� �޾� ���ڿ� ���̸�ŭ �� ���ھ� �˻�
		for (int i = 0; i < str.length(); i++) {
		//str( = ch)���ڿ����� �� ���ھ� ����
			ch = str.charAt(i);
		//ch�� �������� �����ڵ�� �˻� (0 < ch < 9 �� ����)
			if (ch < '0' || ch > '9')
		//���� �ƴ� ���ڰ� ���� ��-->return true->25���� ���� �Է� ���� �߰� continue�� �ٽ� 14�� ����
				return true;
		}	
		//���ڰ� �´ٴ� �� -> 23~���� if �� ���� ���ϰ� �ٷ� 30�� ����
		return false;
	}
	
}
