import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemClassEx02 {

	public static void main(String[] args) {
		//systemŬ������ in �ʵ�� BufferedReader��ü ������
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		//Ű���忡�� �� �� �Է¹޾� ���
		try {
			String str = reader.readLine();
			System.out.println("�Էµ� ���ڿ�: " + str);
		}
		//readLine�޼ҵ尡 �߻��ϴ� IOException�� ó����
		catch (IOException e) {
			System.out.println("Ű���� �Է� ����");
		}

	}

}
