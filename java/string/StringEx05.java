
public class StringEx05 {

	public static void main(String[] args) {
		String str1 = "   Let it be.   ";
		//trim: ���ڿ� �� �� ���� ����
		String str2 = str1.trim();
		System.out.println(str2);
		//concat: ���ڿ� �ڿ� str ����
		System.out.println(str2.concat(" Speaking words of wisdom."));
		//toUpperCase:���ڿ� ��� �ҹ��ڸ� �빮�ڷ� �ٲ�
		System.out.println(str2.toUpperCase());
		//toLowerCase(): ���ڿ� ��� �빮�ڸ� �ҹ��ڷ� �ٲ�
		System.out.println(str2.toLowerCase());
		//replace(a, b): ���ڿ��� ���Ե� ��� a�� b�� �ٲ� 
		System.out.println(str2.replace('e', 'a'));
		System.out.println(str1);
		System.out.println(str2);
	}

}
