
class InheritanceSender04 {
	public static void main(String args[]) {
		EMailSender02 obj1 = new EMailSender02("������ �����մϴ�", "������",
				"admin@dukeeshop.co.kr", "10% ���� ������ ����Ǿ����ϴ�");
		SMSSender03 obj2 = new SMSSender03("������ �����մϴ�", "������",
				"02-000-0000", "10% ���� ������ ����Ǿ����ϴ�");
		//(����)���θ޼ҵ忡�� 
		send(obj1, "hatman@yeyeye.com");
		send(obj1, "stickman@hhaha.com");
		send(obj2, "010-000-0000");

	}
	//������ �����޼ҵ��̴� send�� �������� �ؾ���
	//sendMessage�� �������̵������� �ּ� 100�� obj�� 
	static void send(MessageSender01 obj, String recipient) {
		//ȣ�� ����� obj�� obj1, obj2�� ������ ������ �޶�(�޼ҵ������)�̰� �Ǵ� ������ 02�� 03�� �ڽ�Ÿ��
		//
		obj.sendMessage(recipient);
	}
}
