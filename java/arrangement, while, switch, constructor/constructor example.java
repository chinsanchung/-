
public class Ch06Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������01
	Ch06Car() {
	}
	//������02
	Ch06Car(String model) {
		this.model = model;
	}
	//������03
	Ch06Car(String model, String color) {
		this.model = model;
		this.color =  color;
	}
	//������04
	Ch06Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color =  color;
		this.maxSpeed = maxSpeed;
   }
	//this�� ������ ȣ��..p213
/*	Ch06Car(String model) {
 *		this(model, "silver", 250);
 *	}
 *	
 *	Ch06Car(String model, String color) {
 *		this(model, color, 250); 
 * 	}
 * 	
 * 	Ch06Car(String model, String color, int maxSpeed) {
 * 		this.model = model;
 * 		this.color = color;
 * 		this.maxSpeed = maxSpeed;
 * 	}
 */
}
