import java.util.Scanner;

public class problem01 {

	public static void main(String[] args) {
	/*������ �� ���� �Է¹޾� ���� ������ ū �������� �������� ����Ͻÿ� 
	��°��: ù��° ���� �Է� => 7   �� ��° ���� �Է� => 3
	3��   4��   7��
	ū �� ������: if��..������ ����� �ݺ�+���߱���*/
	//1. ���� �Է�
	int a = 7;
	int b = 3;
	System.out.println("<��°��>");
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("ù ��° ���� �Է� => ");
	a = scanner.nextInt();
	System.out.println("�� ��° ���� �Է� => ");
	b = scanner.nextInt();


	//2. ������ �Է�
	for (int j = 3; j< 8; j++) {
		System.out.print(j + "��" + "\n");	
		for (int i = 1; i < 10; i++) {
			System.out.println(j + " * " + i + " = " + j * i);

			}
		}


	

  
 }
}
