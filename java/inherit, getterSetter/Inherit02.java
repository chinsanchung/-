
public class Inherit02 extends Inherit01 {
//��ɵ�
	//�ʵ�
	int channel;
	
	//������
	Inherit02(String model, String color, int channel) {
		//super(); �ڵ�����
		//super(model, color); ��������� ������ super()�� �����
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
