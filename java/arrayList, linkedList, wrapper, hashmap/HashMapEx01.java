import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
	//�ؽ� ���̺�� ����� �ؽ��� ��ü ����
		HashMap<String, Integer> hashtable = new HashMap<String, Integer>();
		hashtable.put("�ظ�", new Integer(95));
		hashtable.put("�츣�̿´�", new Integer(100));
		hashtable.put("��", new Integer(85));
		hashtable.put("������", new Integer(93));
		hashtable.put("�׺�", new Integer(70));
	//Ű ������ �ؽ� ���̺��� ������ ã�� ���
		Integer num = hashtable.get("�츣�̿´�");
		System.out.println("�츣�̿´��� ������? " + num);

	}

}
