
public class chapter05 {

	public static void main(String[] args) {
//1. ��ü ���� ���� ����
		String str1 = "java";
		String str2 = "java";
		//��ü �ϳ��� �� ���۷����� �ּҸ� �����Ѽ� ����ǥ��
		if (str1 == str2 ) {
			System.out.println("1.����");
		} else {
			System.out.println("1.�ٸ���");
			
		}
		//��ü�� ������ ���������
		String str3 = new String("java");
		String str4 = new String("java");
		
		if (str3 == str4 ) {
			System.out.println("2.����");
		} else {
			System.out.println("2.�ٸ���");
			
		}
		//��ü�� ���ڿ� ��
		if (str1.equals(str2)) {
		System.out.println("1.����");
	} else {
		System.out.println("1.�ٸ���");
		
	}
		if (str3.equals(str4)) {
			System.out.println("2.����");
		} else {
			System.out.println("2.�ٸ���");
			
		}		
//2 �迭 Ÿ�� 
//		int a[] = new int[5];
//		a[0] = 10; ~~~
//		==> int a[] = {10, ~~};
//2-1 �迭 ����
//	int arr[] = {10, 20, 30, 40, 50};
//	int i, sum = 0;
//	for (i = 0; i < arr.length; i++) {
//		
//		sum += arr[i];
//	
//	}
//	System.out.println("sum = " + sum);	

//2-2 1�����迭
		int arr[] = new int[5];
		int i, sum = 0;
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for (i = 0; i < arr.length; i++) {
			
			sum += arr[i];
		
		}
		System.out.println("sum = " + sum);	
//2-3 1�����迭
	//int arr[] = null;
	//arr = new int[5];
	}

}
