import java.util.Random;

public class Ch09Random {

	public static void main(String[] args) {
		//Random(); ()�ȿ� ��(1356L ��) ������ �������� ��
		Random random = new Random();
		//0 <  random < 100
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
	}

}
