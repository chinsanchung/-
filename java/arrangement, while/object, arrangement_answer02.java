import java.util.Scanner;

public class Ch05answer01 {
	//static���� ��ü ���� ���� ������� ��밡���� �ʵ� ����, �Ʒ� static void�� �޼ҵ尡 ��
	//���� �ʵ�..�󸶵��� ����� �����Ѱ� 236��
	static int MAX = 5;
	public static void main(String[] args) {
	//Ŀ�ǵ���� ���� �й�, �̸�, ����, ����, ����, ����, ���, ���
	//A001 �̱��� 88 88 88    A002 ����� 99 99 99
	//0817�� answer01 �̿�

		String[] num = new String[MAX]; 
		String[] name = new String[MAX]; 
		String[] grade = new String[MAX];
		int[] kor = new int[MAX];
		int[] eng = new int[MAX];
		int[] math = new int[MAX]; 
		int[] total = new int[MAX];
		double[] avg = new double[MAX];
		int i, cnt = 0;
		//cnt�� �Է��ؿԴ� ���� ī��Ʈ
		Scanner in = new Scanner(System.in);
		
		for (i = 0; i < MAX; i++) {
		System.out.print("�й� �Է� => ");
		num[i] = in.next();
		//exit�� break ����������
		if (num[i].equals("exit")) {
			break;
		}
		System.out.print("�̸� �Է� => ");
		name[i] = in.next();
		System.out.print("���� �Է� => ");
		kor[i] = in.nextInt();
		System.out.print("���� �Է� => ");
		eng[i] = in.nextInt();	
		System.out.print("���� �Է� => ");
		math[i] = in.nextInt();	
		total[i] = kor[i] + eng[i] + math[i];
		avg[i] = total[i] / 3.;
		
		if (avg[i] >= 90)
			grade[i] = "��";
		 else if (avg[i] >= 80) 
			grade[i] = "��";
		 else if (avg[i] >= 70) 
			grade[i] = "��";
		 else if (avg[i] >= 60) 
			grade[i] = "��";
		 else grade[i] = "��";
		//cnt�� ī��Ʈ, �Է¹��� �����͵� ����. ���� for���� ������ �Է��� �͸�ŭ ��������
		cnt++;
		System.out.println();
		}
		in.close();
		System.out.println("\n\t\t       *** ����ǥ ***");
		System.out.println("=========================================================");
		System.out.println("�й�      �̸�     ����     ����     ����     ����     ���     ���");
		System.out.println("=========================================================");
		for (i = 0; i < cnt; i++) {
		System.out.printf("%4s    %3s    %3d    %3d    %3d    %3d    %6.2f    %2s\n",
						  num[i], name[i], kor[i], eng[i], math[i], total[i], avg[i], grade[i]);
		}
		System.out.println("=========================================================");	
	}


}
