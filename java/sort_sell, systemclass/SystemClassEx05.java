
public class SystemClassEx05 {

	public static void main(String[] args) {
	 //���� �ð� ����
		long time1 = System.currentTimeMillis();
		double total = 0.0;
		
	//������ ������ �ٻ簪�� ����ϴ� �κ�
		for (int cnt = 1; cnt < 1000000000; cnt += 2) {
			if (cnt / 2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;
		
		}
	//���� �ð� ����
		double pi = total * 4;
		long time2 = System.currentTimeMillis();
		System.out.println("result = " + pi);
		System.out.printf("��꿡 %d ms�� �ҿ�Ǿ���", time2 - time1);
		
			
	}

}

