import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Ch09SimpleDateFormat {

	public static void main(String[] args) {
		
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��  MM�� dd�� aa hh�� mm�� ss��");
		//���ڿ��� ����
		String str = dateFormat.format(calendar.getTime());
		System.out.println(str);
	}

}
