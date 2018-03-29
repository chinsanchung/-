import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {
    Socket socket;
    String name;
    SenderThread(Socket socket, String name) {   
        this.socket = socket;
        this.name = name;
    }
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
            PrintWriter writer = 
                new PrintWriter(socket.getOutputStream());
            writer.println(name);
            writer.flush();
            while (true) {
            //������� �о�鿩�� str�� ����
                String str = reader.readLine();
                if (str.equals("bye"))
                    break;
                writer.println(str);
            //���۰� �� �������� ������ ���    
                writer.flush();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

