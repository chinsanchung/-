
public class Ch06Static02 {
	//��ü�� ���� ���� MAX�� ��밡��
	static int MAX = 100;
	public static void main(String[] args) {
	//1 ��ü�ּ� ������ �迭 ����
	Ch06Static01 obj[] = new Ch06Static01[MAX];
	int i = 0;
	
	//2 ��ü
	for (i = 0; i < MAX; i++) {
		//��ǰ ��ü Sangpum01() ����.��ü�ּҸ� obj[i]�� ����
		obj[i] = new Ch06Static01();
		//���� return true�� ���� �ǹ�. if (return true)�� break�� ���̷�
		if (obj[i].input()) {
			break;
		}
		obj[i].process();
		
		System.out.println();
	}
	System.out.println("\n\t       *** �Ǹ���Ȳ ***");
	System.out.println("====================================================");
	System.out.println("��ǰ�ڵ�     ��ǰ��      ����          �ܰ�               �ݾ�");
	System.out.println("====================================================");
	for (i = 0; i < Ch06Static01.cnt; i++) {
	obj[i].output(); 
	}
	System.out.println("====================================================");
	System.out.println("\t\t\t\t �� �Ǹűݾ�: " + Ch06Static01.getTotal());
	}
	

}
