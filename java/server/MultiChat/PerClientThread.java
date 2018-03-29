import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread {
	//����ȭ ������ ����Ʈ ��ü������ִ� collections~
	//List�� arraylist�� �θ�Ŭ����...������ ������ �� ���ÿ� ó���Ϸ���..
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	Socket socket;
	PrintWriter writer;
	
	PerClientThread(Socket socket){
		this.socket = socket;
		try {
		//���Ͽ��� �����ϴ°� ����Ʈ������ ����Ʈ�����ͷ� ���ڴ����� �������
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void run() {
		String name = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = reader.readLine();
			sendAll("#" + name + "���� �����̽��ϴ�");
			while(true) {
				String str = reader.readLine();
				if(str == null)
					break;
				sendAll(name + ">" + str);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			list.remove(writer);
			sendAll("#" + name + "���� �����̽��ϴ�");
			try {
				socket.close();
			}
			catch (Exception ignored) {
				
			}
		}
	}
	
	private void sendAll(String str) {
		for (PrintWriter writer : list) {
		//�۽��ϴ� ������ Ÿ���� ���ڿ�
			writer.println(str);
			writer.flush();
		}
	}

}