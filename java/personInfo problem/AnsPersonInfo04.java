import java.util.Scanner;

public class AnsPersonInfo04 extends AnsPerson01 implements AnsPersonable02{
	String phone;
	String addr;
	
	static int cnt = 0;
	
	AnsPersonInfo04() {
		
	}
	//input, output�� ����� Personable�� �ƴ� ���⿡�� ���
	public boolean input() {
	Scanner in = new Scanner(System.in);
	System.out.print("�й� �Է� => ");
	number = in.next();
	if (number.equals("exit")) 
		return true;
	System.out.print("�̸� �Է� => ");
	name = in.next();
	System.out.print("��ȭ��ȣ �Է� => ");
	phone = in.next();
	System.out.print("�ּ� �Է� => ");
	addr = in.next();	
	cnt++;
	return false;	
	}
	
	public void output() {
		System.out.printf("%4s    %8s    %8s         %5s",
				  number, name, phone, addr);
	}

}
