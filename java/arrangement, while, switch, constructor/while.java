
public class chapter04 {

	public static void main(String[] args) {

//1. 		
//		int i = 1;  //1 �ʱ��
//		while (i <= 10)//2 ���ǽ� 
//			{
//			System.out.println(i); //3 �ݺ�����
//			i++; //4 ������
//		}
//2. 1~10 ���� while��
//		int i = 1;
//		int sum = 0;
//		while (i <= 100) {
//		
//			sum += i;
//			i++;
//		} 
//		System.out.println("i = " + i);
//		System.out.println("sum = " + sum);
//3. do while��
//		int i = 1;
//		int sum = 0;
//		do {
//			sum += i;
//			i++;	
//		} while (i <= 100); 
//		
//		System.out.println("i = " + i);
//		System.out.println("sum = " + sum);
		
//4. do while�� Ȧ�� �հ� ¦�� ���� ����ϱ�
//		int i = 1;
//		int odd=0; 
//		int even=0;
//		do {
//			
//
//			if (i % 2 == 0) {
//				even += i;
//			} else {
//				odd += i;
//			}
//			i++;
//			
//		} while (i <= 100); 
//
//		System.out.println("i = " + i);
//		System.out.println("odd = " + odd);
//		System.out.println("even = " + even);
//		
//5. continue��
		int i = 1;
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			sum += i;
			
		}
		//¦���� continue�� sum�� ����ȵȴ�.
		System.out.println("i = " + i);
		System.out.println("Ȧ���� = " + sum);
	}
	
}
