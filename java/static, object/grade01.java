import java.util.Scanner;

public class Sungjuk {

// 1��° ����
	//����ó���ʵ� ����� ���� ������ �Է�, ����ó���� �ؾ���->������ ���
	//Ŭ�����̸�: Sungjuk �й�, �̸�, ��, ��, ��, tot, avg, grade
	//�޼ҵ� input() ȣ��� �й�, �̸�, ��, ��, �� 
	//�޼ҵ� process() ����, ���, ���
	//�޼ҵ� output() �й�,�̸�, ��, ��, ��, ����, ���, ��� ���
	
	//01 �ʵ�..�ν��Ͻ��ʵ�
	String hakbun, irum, grade;
	int kor, eng, math, tot;
	double avg;
	

	//01-1 �����ʵ� �߰�
	static int cnt = 0;
	static double totalAvg = 0;
	
	//����Ʈ �����ڸ� �ִ� ������ ������
	Sungjuk() {
		
	}
  //�ٸ��� �ҽ� ����� ������..������ �����ε����� �� �� �������
	Sungjuk(String hakbun, String irum, int kor, int eng, int math) {	
	this.hakbun = hakbun;
	this.irum = irum;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	}
	//02 �޼ҵ�..�ν��Ͻ��޼ҵ�
	boolean input() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�й� �Է� => ");
		hakbun = in.next();
		//return�������� void input���� �Ҹ� input���� �ٲ�
		if (hakbun.equals("exit")) 
			return true;
		System.out.print("�̸� �Է� => ");
		irum = in.next();
		System.out.print("���� �Է� => ");
		kor = in.nextInt();
		System.out.print("���� �Է� => ");
		eng = in.nextInt();	
		System.out.print("���� �Է� => ");
		math = in.nextInt();
		//�����ʵ� cnt ����..ī��Ʈ��
		cnt++;
		
		return false;
	}
	
	void process() {
		this.tot = kor + eng + math;
		avg = tot / 3.;
		totalAvg += avg;
		switch((int) avg/10) {
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
	void output() {
		System.out.printf("%2s    %2s    %3d    %3d    %3d    %3d    %6.2f    %2s\n",
				  hakbun, irum, kor, eng, math, tot, avg, grade);
	}
	//02-2 �����޼ҵ� �߰�
	static double getTotal() {
		return totalAvg / cnt;
	}

	
}	
	