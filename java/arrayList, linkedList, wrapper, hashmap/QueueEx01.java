import java.util.LinkedList;

public class QueueEx01 {

	public static void main(String[] args) {
	//ť�� ����� LinkedList ��ü ����
	LinkedList<String> queue = new LinkedList<String>();
	queue.offer("A");
	queue.offer("B");
	queue.offer("C");
	while(!queue.isEmpty()) {
		String str = queue.poll();
		System.out.println(str);
	}

	}

}
