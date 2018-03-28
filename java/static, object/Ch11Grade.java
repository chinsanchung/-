	import java.util.Scanner;

	public class Ch11Grade {
		String hakbun, irum, grade;
		int kor, eng, math, tot;
		double avg;
		
		static int cnt = 0;
		static double total_avg = 0;
		
		Ch11Grade(){
		}
		
		Ch11Grade(String hakbun, String irum, int kor, int eng, int math){
			this.hakbun = hakbun;
			this.irum = irum;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		boolean input()
		{
			Scanner in = new Scanner(System.in);
			
			System.out.print("�й� �Է� => ");
			hakbun = in.next();
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
			cnt++;
			return false;
			
		}
		
		void process()
		{
			tot = kor + eng + math;
			avg = tot / 3.;
			total_avg += avg;

			switch((int)avg/10)
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
			System.out.printf("%4s   %3s   %3d     %3d     %3d     %3d   %6.2f    %2s\n", 
					hakbun, irum, kor, eng, math, tot, avg, grade);
		}
		
		static double get_totalavg()
		{
			return total_avg / cnt;
		}
		//�� GradeEquals �� obj1�� obj2 �񱳽� �ּ� ���� ���� ����� ���� ������ ����
		//objectŬ�������� obj�� �������̵�
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Ch11Grade) {
				Ch11Grade grade = (Ch11Grade) obj;
				if(hakbun.equals(grade.hakbun) &&
				   irum.equals(grade.irum) &&
				   kor == grade.kor &&
				   eng == grade.eng &&
				   math == grade.math) {
					return true;
				}						  				
			}
			return false;
		}
	}


