
public class StringEx01 {

	public static void main(String[] args) {
		String str = "�ڹ� Ŀ��";
		//length �޼ҵ� ȣ��
		int len = str.length();
		for (int cnt = 0; cnt < len; cnt++) {
			//charAt �޼ҵ� ȣ��
			char ch = str.charAt(cnt);
			System.out.println(ch);
		}
		
	}

}
