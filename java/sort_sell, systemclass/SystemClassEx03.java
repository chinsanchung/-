
public class SystemClassEx03 {

	public static void main(String[] args) {
		char arr1[] = {'��', '��', '��','��', '��', '��', '��', '��', '��', '��', 'ī', 'Ÿ',
				 '��', '��'};
		char arr2[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j', 'k'};
		System.arraycopy(arr1, 10, arr2, 2, 3);
		
		for (char ch : arr2)
			System.out.println(ch);
		
		}
		
		
	}


