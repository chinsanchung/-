import java.util.Scanner;

public class Ch05problem01 {

	public static void main(String[] args) {
	//Ŀ�ǵ���� ���� �й�, �̸�, ����, ����, ����, ����, ���, ���
	//A001 �̱��� 88 88 88    A002 ����� 99 99 99
	//0817�� answer01 �̿�

		String[] num = new String[2]; 
		String[] name = new String[2]; 
		String grade ;
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] math = new int[2]; 
		int[] total = new int[2];
		double[] avg = new double[2];
		Scanner in = new Scanner(System.in);
		//1 ù��° ���
		System.out.print("�й� �Է� => ");
		num[0] = in.next();
		System.out.print("�̸� �Է� => ");
		name[0] = in.next();
		System.out.print("���� �Է� => ");
		kor[0] = in.nextInt();
		System.out.print("���� �Է� => ");
		eng[0] = in.nextInt();	
		System.out.print("���� �Է� => ");
		math[0] = in.nextInt();	
		total[0] = kor[0] + eng[0] + math[0];
		avg[0] = total[0] / 3.;
		
		if (avg[0] >= 90)
			grade = "��";
		 else if (avg[0] >= 80) 
			grade = "��";
		 else if (avg[0] >= 70) 
			grade = "��";
		 else if (avg[0] >= 60) 
			grade = "��";
		 else grade = "��";
		//2��° ���
		Scanner in1 = new Scanner(System.in);
		System.out.print("�й� �Է� => ");
		num[1] = in1.next();
		System.out.print("�̸� �Է� => ");
		name[1] = in1.next();
		System.out.print("���� �Է� => ");
		kor[1] = in1.nextInt();
		System.out.print("���� �Է� => ");
		eng[1] = in1.nextInt();	
		System.out.print("���� �Է� => ");
		math[1] = in1.nextInt();
		total[1] = kor[1] + eng[1] + math[1];
		avg[1] = total[1] / 3.;
		
		in.close();
		in1.close();
		
		if (avg[1] >= 90)
			grade = "��";
		 else if (avg[1] >= 80) 
			grade = "��";
		 else if (avg[1] >= 70) 
			grade = "��";
		 else if (avg[1] >= 60) 
			grade = "��";
		 else grade = "��";
		
		System.out.println("\n\t\t       *** ����ǥ ***");
		System.out.println("=========================================================");
		System.out.println("�й�     �̸�    ����    ����    ����    ����    ���    ���");
		System.out.println("=========================================================");
		System.out.printf("%2s    %2s    %3d    %3d    %3d    %3d    %6.2f    %2s\n",
						  num[0], name[0], kor[0], eng[0], math[0], total[0], avg[0], grade);
		System.out.printf("%2s    %2s    %3d    %3d    %3d    %3d    %6.2f    %2s\n",
				  num[1], name[1], kor[1], eng[1], math[1], total[1], avg[1], grade);	
		System.out.println("=========================================================");	
	
	
	
	
	
	
	
	
	}

}
