
public class HashCodeEx02 {

	public static void main(String[] args) {
	//�� ���� ���� ��ü ����
		Name obj1 = new Name("�츣�̿´�", "�׷�����");
		Name obj2 = new Name("�츣�̿´�", "�׷�����");
	//������ ��ü�� ���� �ؽ��ڵ� �޼ҵ� ȣ���ϱ�
	int hash1 = obj1.hashCode();
	int hash2 = obj2.hashCode();
	//�ؽ��ڵ� �޼ҵ��� ���� �� ����ϱ�
	System.out.println(hash1);
	System.out.println(hash2);
	}
	//�ٸ� �ؽ��ڵ� ������ ������
	//NameŬ������ ObjectŬ�����κ��� ��ӹ��� �ؽ��ڵ� �޼ҵ带 �״�� ����ϰ� �ֱ� ����
	

}
