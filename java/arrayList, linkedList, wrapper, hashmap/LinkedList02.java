import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList02 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		//Iterator �޼ҵ� ȣ���Iterator ��ü ����
		Iterator<String> iterator = list.iterator();
		//Iterator ��ü�� �̿��� ����Ʈ�� �����͸� ���������� ������ ���
		

		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}

}
