
public class Ch08RemoteControlEx04 {

	public static void main(String[] args) {
		Ch08Television02 tv = new Ch08Television02();
		Ch08Audio03 audio = new Ch08Audio03();
		
		processControl(tv);
		processControl(audio);

	}
	static void processControl(Ch08RemoteControl01 rc) {
		rc.turnON();
		rc.turnOff();
	}
	/*�͸��� Ŭ����..��ȸ��
	public static void main String(args args) {
	 Ch08RemoteControl01 rc = new Ch08RemoteControl01() {
	 	public void turnOn() {
	 	System.out.println("turn on");
	 	}
	 	public void turnOff() {
	 	System.out.println("turn off");
	 	}	
	 	public void setVolume() {
	 	System.out.println("set volume");
	 	}	 
	  };
	  rc.turnOn();
	  rc.turnOff();
	  rc.setVolume(100);
	   }
	 }
	 */
	/* �������̽��迭�� ���� ��ü ����
	public static void main(String[] args) {
	 Ch08RemoteControl01 obj[] = new Ch08RemoteControl01[2];
	 
	 obj[0] = new Ch08Television02();
	 obj[1] = new Ch08Audio();
	 //���� �迭�� �����ּ� ����..obj�� �迭�̶� �ؿ� obj1[]�� ��
	 processControl(obj);
	 }
	 static void processControl(Ch08RemoteControl01 obj1[]) {
		for(int i = 0; i < obj1.length; i++) {
		obj1[i].turnON();
		obj1[i].turnOff();
		}
	}
	 */
}
