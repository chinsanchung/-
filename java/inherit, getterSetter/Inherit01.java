
public class Inherit01 {
//�ڵ���
	//�ʵ�
	String model;
	String color;
	
	//������ �����ؼ� ����� Inherit02�� �����ڿ� ���� �߻�. �ڽ� ������ ���鶧 �θ� ������ ȣ���ϱ⿡
	//����Ʈ �����ڸ� ���� �����ϸ� ���� �����..����Ʈ�����ڴ� ������ �����α�
	Inherit01() {
	}
	Inherit01(String model, String color) {
		this.model = model;
		this.color = color;
	}
	//�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	void sendVoice(String message) {
		System.out.println("�ڱ�: " + message);
	}
	void receiveVoice(String  message) {
		System.out.println("���� : " +  message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�");
	}
}
