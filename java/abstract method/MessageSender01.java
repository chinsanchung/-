
abstract public class MessageSender01 {
	//�ʵ�
	String title;
	String senderName;
	MessageSender01(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	//�߻�޼ҵ�(�Ķ���ͷ� ���� recipient)
	abstract void sendMessage(String recipient);
}
