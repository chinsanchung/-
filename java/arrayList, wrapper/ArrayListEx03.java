import java.util.ArrayList;

public class Ch13ArrayListEx03 {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("B");
	//������ ó�������� �˻�
	int index1 = list.indexOf("B");
	//������ �������������� �˻�
	int index2 = list.lastIndexOf("B");
	
	System.out.println("Frist B: " + index1);
	System.out.println("Last B: " + index2);
	}

}
