import java.util.Scanner;

public class problem02 {


	public static void main(String[] args) {
	/*������ �� ���� �Է� �޾� ���� ������ ū �� ���̿� �����ϴ� �Ҽ�(prime number)��
	 * ���ؼ� ����Ͻÿ�
	 * ó������: �� �ٿ� 10���� ���, �������� �� �Ҽ��� ������ ���(count)
	 * ���: ù ��° �����Է� => 100 �ι�° => 10...10~100 ���� �Ҽ�
	 * i = 10(j 2~9 ��������) 11(j 2~10 ��������) 12(j 2~11 ��������) ..���߷���
	 */
		//1. ������ �� �� �Է�
	int a = 100;
	int b = 10;
	System.out.println("<��°��>");


		
	Scanner scanner = new Scanner(System.in);
	System.out.println("ù ��° ���� �Է� => ");
	a = scanner.nextInt();
	System.out.println("�� ��° ���� �Է� => ");
	b = scanner.nextInt();

	//2. �Ҽ� ���ؼ� ���
	
	int i;
	int j;

	for (i = 10; i <= 100; i++) {
		for (j = 2; j < i; j++) {
	
			if (i % j == 0)  {
			
		  }
			System.out.print(i + ", ");
		}
	}
	
  }
}
