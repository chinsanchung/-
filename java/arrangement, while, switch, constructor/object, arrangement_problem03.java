import java.util.Scanner;

public class Ch05problem02 {
	static int MAX = 100;
	public static void main(String[] args) {
	//��ǰ�ڵ�, ��ǰ��, ����, �ܰ�, �ݾ�(���� * �ܰ�) �Է�..exit�� Ż��
	// *** �Ǹ���Ȳ *** �ؿ��� ����ǥ�� �����ϰ� �� �������� �� �Ǹűݾ�
	//1	
	String code[] = new String[MAX];
	String name[] = new String[MAX];
	int amount[] = new int[MAX];
	int price[] = new int[MAX];
	int totalP[] = new int[MAX];
	int i, cnt = 0;
	int sum = 0;
	//2
	Scanner in = new Scanner(System.in);	
	
	for(i = 0; i < MAX; i++) {
	System.out.println("��ǰ�ڵ�: ");
	code[i] = in.next();
	
	if (code[i].equals("exit")) {
		break;
	}
	System.out.println("��ǰ��: ");
	name[i] = in.next();
	System.out.println("����: ");
	amount[i] = in.nextInt();
	System.out.println("�ܰ�: ");
	price[i] = in.nextInt();
	totalP[i] = amount[i] * price[i];
	cnt++;
	System.out.println();
	}
	in.close();
	//3
	System.out.println("\n\t       *** �Ǹ���Ȳ ***");
	System.out.println("=============================================");
	System.out.println("��ǰ�ڵ�     ��ǰ��      ����      �ܰ�       �ݾ�");
	System.out.println("=============================================");
	for (i = 0; i < cnt; i++) {
	System.out.printf("%4s    %3s    %6d     %5d    %8d\n",
					  code[i], name[i], amount[i], price[i], totalP[i]);
	sum += totalP[i];
	}
	System.out.println("=============================================");
	//4 �������� �� �Ǹűݾ��� ���	
	System.out.println("\t\t\t�� �Ǹűݾ� : " + sum);
	
	
	
	}
}
