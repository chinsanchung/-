
public class Ch08Audio03 implements Ch08RemoteControl01 {
	//�ʵ�
	protected int volume;
	
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("Turn on TV");
	}

	//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("Turn off TV");
	}

	//setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int volume) {
		if (volume > Ch08RemoteControl01.MAX_VOLUME) {
			this.volume = Ch08RemoteControl01.MAX_VOLUME;
		} else if (volume > Ch08RemoteControl01.MIN_VOLUME) {
			this.volume = Ch08RemoteControl01.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("TV volume: " + volume);
	}

	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		
	}


}
