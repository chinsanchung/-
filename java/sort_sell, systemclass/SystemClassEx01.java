import java.io.IOException;
import java.io.InputStreamReader;

public class SystemClassEx01 {

	public static void main(String[] args) {
		InputStreamReader  reader = new InputStreamReader (System.in);
		
		try {
		//Ű����κ��� �� ���ھ� �Է¹޾� ����ϴµ� . �Է��� ������ �ݺ�
			while(true) {
			//read�޼ҵ��� ���� ���� intŸ���ε� �� ���� ���� �ϳ��� ��Ƽ� char�� ĳ��Ʈ�ؾ���
				char ch = (char) reader.read();
				System.out.println("�Էµ� ����: " + ch);
				if (ch == '.')
					break;
			}
		}
        catch (IOException e) {
            System.out.println("Ű���� �Է� ����");
	}
 }
}
