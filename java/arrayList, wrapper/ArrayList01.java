import java.util.ArrayList;

public class Ch12ArrayList01 {

	public static void main(String[] args) {
	//ArrayList ��ü ����
	ArrayList<String> list = new ArrayList<String>();
	//������ �߰��ϱ�
	list.add("A");
	list.add("B");
	list.add("C");
	//�������� �� ���
	int num = list.size();
	//����Ʈ�� ������ ����ŭ ���� ���� �����͸� �о�� �����
	for (int cnt = 0; cnt < num; cnt++) {
		String str = list.get(cnt);
		System.out.println(str);
	}
	//���� for������ ����ϱ�
	System.out.println();
	for (String str : list)
		System.out.println(str);
	}

}
