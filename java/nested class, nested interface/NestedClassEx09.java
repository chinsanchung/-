package ch16;

public class NestedClassEx09 {

	public static void main(String[] args) {
	//�̸� ���� �̳� Ŭ����
		MessageSender obj = new MessageSender() {
			void send(String message) {
				System.out.println("From : Midas");
				System.out.println("To: Bill Gates");
				System.out.println("Message: " + message);
				System.out.println();
			}
		}; //�̸� ���� �̳�Ŭ������ �� �������� �����ݷ�
		obj.send("Good morning");
	}

}
