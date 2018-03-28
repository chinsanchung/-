
public class ExAccount04_02 {
	public static void main(String[] args) throws Exception {
		//�迭�� ���������� �غ��� ���
		Account01 obj[] = new Account01[3];
		obj[0] = new Account01("111-22-33333", "Ken", 10000);
		obj[1] = new CheckingAccount02("444-55-66666", "May", 20000, "5555-6666-7777-88");
		obj[2] = new CreditLineAccount03("777-88-99999", "Max", 30000, 20000000);
		
		printAccountInfo(obj);
		
	}
	//i�� 0�϶� Account01�� accountNo, i�� 1�϶� CheckingAccount02�� accountNo...
	//���� �̸��� accountNo���� ������ �ٸ���..����
	static void printAccountInfo(Account01 obj1[]) throws Exception {
	  for(int i = 0; i < obj1.length; i++) {
		System.out.println("���¹�ȣ: " + obj1[i].accountNo);
		System.out.println("������ �̸�: " + obj1[i].ownerName);
		System.out.println("�ܾ�: " + obj1[i].balance);
		System.out.println();
		}
	}
}
