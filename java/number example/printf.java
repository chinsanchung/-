
public class printf {

	public static void main(String[] args) {
		System.out.printf("%s\n", "MBC");
		System.out.printf("%10s\n", "MBC");
		System.out.printf("%6.2f\n", 123.456);  //6�ڸ� + �Ҽ��� ��°�ڸ����� �ϱ�(000.00���� 6�ڸ�)
		//�׷��� ��°�ڸ� �̻��� ���ϱ�..�Ҽ���°�ڸ��� �߸��µ� �ݿø��ؼ� ó���Ѵ�..
		System.out.printf("%10.2f\n", 123.4567); //0000123.46(�ݿø�)
		System.out.printf("%.2f\n", 123.4567); //���������� ����..������ ���ڶ� ������ �ڸ��� �ʰ�
		//�˾Ƽ� ���ش�
		System.out.printf("%c\n", 'A');
		System.out.printf("%5c\n", 'A');  //���� %-5c\n���� �ҽ� -������ ������ ���ʿ��� ���������� �ٲ��
	}

}
