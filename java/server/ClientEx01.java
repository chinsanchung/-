

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx01 {

	public static void main(String[] args) {
		Socket socket = null;
		try {
		//���� ��ü ����
			socket = new Socket( "192.168.3.217", 9000);
        //������ �ۼ��ſ� ����� ��/��� ��Ʈ�� ��ü
			InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            String str = "Hello, Server";
       //write�� read �޼ҵ� ȣ���ؼ� ������ ��/����
            out.write(str.getBytes());
            byte arr[] = new byte[100];
            in.read(arr);
            System.out.println(new String(arr));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try { 
            //���� ���� �� �������ϵ� �ݾƾ���
                socket.close(); 
            } 
            catch (Exception e) {
            }
        }
    }
}