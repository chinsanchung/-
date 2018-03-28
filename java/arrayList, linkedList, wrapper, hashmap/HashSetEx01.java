import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {

	public static void main(String[] args) {
	//�������� ����� HashSet ��ü ����
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("cappuccino");
		set.add("espresso");
		set.add("java");
		System.out.println("����� ������ �� = " + set.size());
	//���տ� �ִ� �����͸� ��� ������ ���
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);	
		}
		//���� ��������
		System.out.println();
		for(String str : set)
			System.out.println(str);
	}

}
