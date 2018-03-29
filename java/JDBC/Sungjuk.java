package SungjukOracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sungjuk {

	String hakbun, irum, grade;
	int kor, eng, math, total;
	double avg;
	
	Sungjuk()
	{
	}
	
	void input()
	{
	//finally���� in.close�� ���� ���⼭ null �ϰ� try �ȿ��� in =~~�ϱ�
		BufferedReader in = null;
		try {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�й� �Է� => ");
		hakbun = in.readLine();
		System.out.print("�̸� �Է� => ");
		irum = in.readLine();
		System.out.print("���� �Է� => ");
		kor = Integer.parseInt(in.readLine());
		System.out.print("���� �Է� => ");
		eng = Integer.parseInt(in.readLine());
		System.out.print("���� �Է� => ");
		math = Integer.parseInt(in.readLine());
		} catch(IOException e) {
			System.out.println("�Է� ���� " + e.getMessage());
		} 
	}//input
	
	void process()
	{
		total = kor + eng + math;
		avg = total /3.;
		
		switch ((int)avg/10)
		{
			case 10:
			case 9:
				grade = "��";
				break;
			case 8:
				grade = "��";
				break;
			case 7:
				grade = "��";
				break;
			case 6:
				grade = "��";
				break;
			default:
				grade = "��";
				break;
		}
	}
	
	void output()
	{
		System.out.printf("%4s  %3s   %4d  %4d  %4d  %4d %6.2f %3s\n",
				hakbun, irum, kor, eng, math, total, avg, grade);
	}
}
