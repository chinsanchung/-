import java.util.Scanner;

public class problem01_ch04 {

	public static void main(String[] args) {
//	�й�, �̸�, ����, ����, ���� ������ �Է� ���� �� ����, ���, ����� ���ؼ� ����ϱ�
//	����� if������ ���ϱ�
//	<��°��> 
//					*** ����ǥ ***
//	=====================================				
//	�й�	   �̸�  ���� ���� ���� ���� ��� ���
//	=====================================
//	A001  ȫ�浿  70   80   90  240  80.0 ��
	
		//1 ��°���� ����ǥ �Է�
		
		System.out.print("<��°��>");
		System.out.println();
		System.out.println("\t\t\t\t" + "*** ����ǥ ***");
		System.out.println();
		System.out.println("============================================================");
		System.out.println("�й�    " + "�̸�    " + "����  " + "����  " + "����  " + "����  " + "���   "+ "���");		
		System.out.println("============================================================");
		//2...����
		String num;
		String name;
		int kor;
		int eng;
		int math;
		Scanner scan = new Scanner(System.in);
		System.out.print("�й� : ");
		num = scan.next();
		System.out.print("�̸� : ");
		name = scan.next();
		System.out.print("���� : ");
		kor = scan.nextInt();
		System.out.print("���� : ");
		eng = scan.nextInt();
		System.out.print("���� : ");
		math = scan.nextInt();
		System.out.println();
		scan.close();
		//3 �л� ���� �Է�

		System.out.printf("%s %s %5d %4d %3d", num, name, 70, 80, 90);
		//4 ������ ��հ� ���
		int sum = kor + eng + math;
		int avg = (sum / 3);
		String grade;
		if (avg >= 80) {
			grade = "��";
		

		System.out.printf("   %d %3d %3s", sum, avg, grade);
		}
	}

}
