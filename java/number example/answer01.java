//import ����: scanner Ŭ������ ���� �ٸ� Ŭ���� �����ϱ� ����
import java.util.Scanner;

public class answer01 {
//public���� ��Ű���� �ٸ����� �ش� Ŭ���� ���� ���
	public static void main(String[] args) {
		/*������ �� ���� �Է¹޾� ���� ������ ū �������� �������� ����Ͻÿ� 
		��°��: ù��° ���� �Է� => 7   �� ��° ���� �Է� => 3
		3��   4��   7��
		ū �� ������: if��..������ ����� �ݺ�+���߱���*/

		Scanner in = new Scanner(System.in);
		int num1, num2, min, max; //num1, num2, min, max ������ ������..ó���� 
//		System.out.println(num1);
		
		System.out.print("ù ��° ���� �Է� => ");
		num1 = in.nextInt();  
		System.out.print("ù ��° ���� �Է� => ");
		num2 = in.nextInt();
		System.out.println();
		//ū ���� max, ������ min
		
		if (num1 < num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}
		
		for (int i = min; i <= max; i++) {
			System.out.print("*** " + i + "�� *** ");
		}
		System.out.println();
		for (int j = 1; j <= 9; j++) {
			for (int i = min; i <= max; i++) {
				System.out.printf("%d * %d = %2d   ", i, j, i * j);
			}  //%2d �� �� �ڸ��� ���� �Է°����ϰ� ��������
			System.out.println();
		}
	}

}
