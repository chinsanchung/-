
public interface Ch08RemoteControl01 {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	void turnON();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("Mute");
		} else {
			System.out.println("Cancel Mute");
		}
	}
	
	//���� �޼ҵ�
	static void changeBattery() {
		System.out.println("Changing battery");
	}
}
