
class Ch12WrapperEx01 {

	public static void main(String[] args) {
		//Integer ��ü ����..12�� �ϳ� "12" + "7", "12" + 7�� �ص� �� ����
		Integer obj1 = new Integer("12");
		Integer obj2 = new Integer("7");
		//12 + 7�� �ϰ� ������ ��ü��� +�� �Ұ���. �׷��� intValue��
		//��ü ���� int���� ������
		int sum = obj1.intValue() + obj2.intValue();
		System.out.println(sum);
	}

}
