
public class StringBuilderEx01 {

	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("���縦 �ϳ��� �Ƕ��� �Ĵٰ� ");
	System.out.println(sb);
	//append(~): ���ڿ� �ڿ� ~�� ������
	System.out.println(sb.append("Ŀ�ٶ� ���ε��� ������ ������� ����"));
	//insert(A, B): ���ڿ� A��ġ�� B ����
	System.out.println(sb.insert(26,  "�ϳ� "));
	//delete(A, B): A���� B-1�ڸ������� ���ڿ� ����
	System.out.println(sb.delete(21, 23));
	//deleteChartAt(a): a��ġ�� �ִ� �ϳ��� ���� ����
	System.out.println(sb.deleteCharAt(9));
	}

}
