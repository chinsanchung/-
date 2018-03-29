import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Sangpum {
	String code, irum;
	int su, dan, price;
	LinkedList<Sangpum> list = new LinkedList<Sangpum>();
	

	Sangpum(String code, String irum, int su, int dan)
	{
		this.code = code;
		this.irum = irum;
		this.su = su;
		this.dan = dan;
	}
	
	Sangpum() {
	
	}

	boolean input(LinkedList<Sangpum> list) {
		
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));

		try {
	
			while (true) {
		
				System.out.print("�ڵ� �Է� => ");
				code = in.readLine();
		//��ǰ��ü�� ���� indexOf ������..�ݺ����� �Ἥ ��ü�� �ϳ��ϳ� �̾Ƽ� �ڵ带 ���ؾ��Ѵ�
		//		int index = list.indexOf(code);
		//����Ʈ�� ������ ������ FOR���� �ȵ��ư�. ������ ������ �ϳ� �о����
		//�Ʒ� IF������ OBJ�ڵ��ϰ� ���� �� ������ ���� Ʈ��
				for (Sangpum obj : list)  {
		// Ű�� code �����ϴ��� Ȯ��. ������ null�� ��ȯ
					if (obj.code.equals(code)) {
		
						return true;
					}//if	
				}//for
				System.out.print("�̸� �Է� => ");
				irum = in.readLine();
				System.out.print("���� �Է� => ");
				su = Integer.parseInt(in.readLine());
				System.out.print("�ܰ� �Է� => ");
				dan = Integer.parseInt(in.readLine());
				return false;
		}//while
		} catch (IOException e) {
			System.out.println();
		}//catch
		return false;
	}//input

	void process() {
		price = su * dan;
	}
	
	void output() {	
		System.out.printf("%4s   %3s   %4d       %4d     %5d \n",
			code, irum, su, dan, price);
	}

}//end
