import java.util.ArrayList;

public class Ch13ArrayListEx02 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		//������ �߰��ϱ�
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(2, "D");
		list.set(0, "E");
		list.remove(1);
		list.remove("D");
		int num = list.size();
		
		//list �����͸� ������� ���
		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}	
		
	}
}
