import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SungjukHashMap {
	public static void main(String[] args) {
		HashMap<String, Sungjuk> hashmap = new HashMap<String, Sungjuk>();
		Scanner scan = new Scanner(System.in);
		  
		while(true)
		{
			int menu;
				
			System.out.println("\n*** �޴� ***");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ��ȸ");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� ���");
			System.out.println("6. ��     ��\n");
			
			System.out.print("�޴� ����(1~6) => ");
			menu = scan.nextInt();
			
			if (menu == 6)
			{
				System.out.println("\n���α׷� ����...");
				break;
			}
			
			switch (menu)
			{
				case 1:
					input_sungjuk(hashmap);
					break;
				case 2:
					search_sungjuk(hashmap);
					break;
				case 3:
					update_sungjuk(hashmap);
					break;
				case 4:
					delete_sungjuk(hashmap);
					break;
				case 5:
					output_sungjuk(hashmap);
					break;
				default:
					System.out.println("\n�޴��� �ٽ� �����ϼ���!!!");
					break;
			}
		}
	}		
	static void input_sungjuk(HashMap<String, Sungjuk> hashmap)
	{
		Sungjuk obj = new Sungjuk();
		
		System.out.println();
		
		if (obj.input(hashmap))
		{
			System.out.println("\n�̹� �Էµ� �й��Դϴ�!!!");
			return;
		}
		
		obj.process();
		hashmap.put(obj.hakbun, obj);
		
		System.out.println("\n���� �Է� ����!!!");
	}
	
	static void search_sungjuk(HashMap<String, Sungjuk> hashmap)
	{
		Scanner scan = new Scanner(System.in);
		Sungjuk obj;
		
		System.out.print("\n��ȸ�� �й� �Է�  => ");
		String hakbun = scan.next();
		
		obj = hashmap.get(hakbun);
		if (obj != null)
		{
			System.out.println();
			System.out.println("�й�    �̸�     ����    ����    ����    ����    ���    ���");
			System.out.println("============================================================");
			obj.output();
			System.out.println("============================================================");
		}
		else
			System.out.println("\n�������� �ʴ� �й��Դϴ�!!!");
	}
	
	static void update_sungjuk(HashMap<String, Sungjuk> hashmap)
	{
		Scanner scan = new Scanner(System.in);
		Sungjuk obj;
		
		System.out.print("\n������ �й� �Է� => ");
		String hakbun = scan.next();
		
		obj = hashmap.get(hakbun);
		if (obj != null)
		{
			System.out.print("\n���� �Է� => ");
			obj.kor = scan.nextInt();
			System.out.print("���� �Է� => ");
			obj.eng = scan.nextInt();
			System.out.print("���� �Է� => ");
			obj.math = scan.nextInt();
				
			obj.process();
			//hashmap.put(obj.hakbun, obj);	
			System.out.println("\n" + hakbun + " �й� ���� �Ϸ�!!!");
			}
		else
			System.out.println("\n�������� �ʴ� �й��Դϴ�!!!");
	}
	
	static void delete_sungjuk(HashMap<String, Sungjuk> hashmap)
	{
		Scanner scan = new Scanner(System.in);
		Sungjuk obj;
		
		System.out.print("\n������ �й� �Է� => ");
		String hakbun = scan.next();
		
		obj = hashmap.get(hakbun);
		if (obj != null)
		{
			hashmap.remove(obj.hakbun);
			System.out.println("\n" + hakbun + " �й� ���� �Ϸ�!!!");
		}
		else
			System.out.println("\n�������� �ʴ� �й��Դϴ�!!!");
	}
	
	static void output_sungjuk(HashMap<String, Sungjuk> hashmap)
	{
		Sungjuk obj;
		
		Set<String> keyset = hashmap.keySet(); // hashmap�� �����ϴ� Ű ������ ����
		
		if (keyset.size() == 0)  //if (hashmap.isEmpty())
		{
			System.out.println("\n����� �����Ͱ� �����ϴ�!!!");
			return;
		}
		
		System.out.println();
		System.out.println("\n                       *** ����ǥ ***");
		System.out.println("============================================================");
		System.out.println("�й�    �̸�     ����    ����    ����    ����    ���    ���");
		System.out.println("============================================================");
		
		for (String hakbun : keyset)
		{
			obj = hashmap.get(hakbun);
			obj.output();
		}
		System.out.println("============================================================");
		
		/*
		Set entryset = hashmap.entrySet(); // hashmap�� �����ϴ� Ű�� ���� ������ ����
		
		if (entryset.size() == 0)
		{
			System.out.println("\n����� �����Ͱ� �����ϴ�!!!");
			return;
		}
		
		Iterator it_entry = entryset.iterator(); // �������� ������ ���� Iterator ��ü�� ��ȯ
		
		System.out.println();
		System.out.println("\n                       *** ����ǥ ***");
		System.out.println("============================================================");
		System.out.println("�й�    �̸�     ����    ����    ����    ����    ���    ���");
		System.out.println("============================================================");
		
		while(it_entry.hasNext())
		{
			// Ű�� ���� �б� ���� Map.Entry�� ĳ��Ʈ ����
			Map.Entry e = (Map.Entry) it_entry.next();
			// e.getValue():������ ���� �о� ��, e.getKey():Ű ���� �о��
			obj = (Sungjuk)e.getValue(); // e.getValue()�� ���� Ÿ���� Object�̹Ƿ� Sungjuk���� ĳ��Ʈ ����
			obj.output();
		}
		System.out.println("============================================================");
		*/
	}
}
