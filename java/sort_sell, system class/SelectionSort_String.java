
public class SelectionSort_String {

	public static void main(String[] args) {

		String a[] = {"M", "T", "K", "S"};
		String temp;
		int i, j;
		//a.length�� 4
		for (i = 0; i < a.length-1; i++) {
			for (j = i + 1; j < a.length; j++) {
			//a[i]�� ũ�� ���(���� ��ȯ�Ѵ�) + 0���� ũ�� �Ʒ� ����..a[j]�� ũ�� ����
			//��ü�� �ּҸ� �ٲٴ°�
				if (a[i].compareTo(a[j]) > 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			for (int k = 0; k< a.length; k++) 
				System.out.printf("%6s", a[k]);
				
				System.out.println();
		}

	}

}
