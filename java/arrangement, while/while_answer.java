import java.util.Scanner;

public class answer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num, name, grade;
		int kor, eng, math, total;
		double avg;
		Scanner in = new Scanner(System.in);
		
		System.out.print("�й� �Է� => ");
		num = in.next();
		System.out.print("�̸� �Է� => ");
		name = in.next();
		System.out.print("���� �Է� => ");
		kor = in.nextInt();
		System.out.print("���� �Է� => ");
		eng = in.nextInt();	
		System.out.print("���� �Է� => ");
		math = in.nextInt();	
		in.close();
		total = kor + eng + math;
		//3.���� ����Ÿ������ ��ȯ�ϰ� �ȴ�(������� �Ҽ����� �����ϱ�)
		avg = total / 3.;
		
		if (avg >= 90)
			grade = "��";
		 else if (avg >= 80) 
			grade = "��";
		 else if (avg >= 70) 
			grade = "��";
		 else if (avg >= 60) 
			grade = "��";
		 else grade = "��";
		
		System.out.println("\n\t\t       *** ����ǥ ***");
		System.out.println("=========================================================");
		System.out.println("�й�     �̸�    ����    ����    ����    ����    ���    ���");
		System.out.println("=========================================================");
		System.out.printf("%2s    %2s    %3d    %3d    %3d    %3d    %6.2f    %2s\n",
						  num, name, kor, eng, math, total, avg, grade);
	}

}
