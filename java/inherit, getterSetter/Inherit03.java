
public class Inherit03 {
	public static void main(String[] args) {
		
		//Inherit02�κ��� ��ü ����
		Inherit02 inherit02 = new Inherit02("�ڹ���", "����", 10);
		
		//Inherit01�κ��� ��ӹ��� �ʵ�
		System.out.println("�� " + inherit02.model);
		System.out.println("���� " + inherit02.color);
		
		//Inherit02�� �ʵ�
		System.out.println("ä�� " + inherit02.channel);
		
		//Inherit01�κ��� ��ӹ��� �޼ҵ� ȣ��
		inherit02.powerOn();
		inherit02.bell();
		inherit02.sendVoice("��������");
		inherit02.receiveVoice("�ȳ��ϼ���. �� �浿�̴�");
		inherit02.sendVoice("�� �ݰ���");
		inherit02.hangUp();
		
		//Inherit02�� �޼ҵ� ȣ��
		inherit02.turnOnDmb();
		inherit02.changeChannelDmb(12);
		inherit02.turnOffDmb();
		
		
		
		
		
	}
}
