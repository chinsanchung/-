
class EMailSender02 extends MessageSender01{
	String senderAddr;
	String emailBody;
	EMailSender02(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	//01�� �߻�޼ҵ� sendMessage�� �������ؼ� ��ӹ���
	void sendMessage(String recipient) {
		System.out.println("------------------------");
		System.out.println("����: " + title);
		System.out.println("������ ���: " + senderName + " " + senderAddr);
		System.out.println("�޴� ���: " + recipient);
		System.out.println("����: " + emailBody);
	}
}
