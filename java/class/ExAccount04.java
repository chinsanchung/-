
public class ExAccount04 {

	public static void main(String[] args) {
		//���۷��� ������ obj1, obj2, obj3. new~~��ü��3��
		Account01 obj1 = new Account01("111-22-33333", "Ken", 10000);
		CheckingAccount02 obj2 = new CheckingAccount02("444-55-66666", "May", 20000, "5555-6666-7777-88");
		CreditLineAccount03 obj3 = new CreditLineAccount03("777-88-99999", "Max", 30000, 20000000);
		
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);

	}
	static void printAccountInfo(Account01 obj) {
		System.out.println("���¹�ȣ: " + obj.accountNo);
		System.out.println("������ �̸�: " + obj.ownerName);
		System.out.println("�ܾ�: " + obj.balance);
		System.out.println();
		}
	}

