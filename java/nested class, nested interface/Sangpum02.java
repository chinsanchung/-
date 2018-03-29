import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Sangpum02 {
	
	public static void main(String[] args) {
		LinkedList<Sangpum> list = new LinkedList<Sangpum>();
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));

		while(true) {
		
			int menu = 0;
			try {
			System.out.println("\n*** �޴� ***");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� ����");
			System.out.println("6. ��     ��\n");
			
			System.out.print("�޴� ����(1~6) => ");
			menu = Integer.parseInt(in.readLine());
			
			
				if (menu == 6) {
			
					System.out.println("\n���α׷� ����...");
					break;
				}//if
			
			switch (menu) {
			
				case 1:
					input_sangpum(list);
					break;
				case 2:
					output_sangpum(list);
					break;
				case 3:
					search_sangpum(list);
					break;
				case 4:
					update_sangpum(list);
					break;
				case 5:
					delete_sangpum(list);
					break;
				default:
					System.out.println("\n�޴��� �ٽ� �����ϼ���");
					break;
			}//switch
			
			} //try
			catch (IOException e){
				}
			
		}//while
	}//main
	
	static void input_sangpum(LinkedList<Sangpum> list) {
	
		Sangpum obj = new Sangpum();
		
		System.out.println();
		
		if (obj.input(list)) {
		
			System.out.println("\n�̹� �Էµ� ��ǰ�Դϴ�");
			return;
		}
		
		obj.process();
		list.add(obj);
		
		System.out.println("\n��ǰ �Է� ����");
	}//input
	
	static void output_sangpum(LinkedList<Sangpum> list) {
	
		if (list.size() == 0) {
		
			System.out.println("\n����� �����Ͱ� �����ϴ�");
			return;
		}
		
		sort_sel(list);
		
		System.out.println();
		System.out.println("\n\t        *** ��ǰ ***");
		System.out.println("===================================");
		System.out.println("��ǰ�ڵ�    ��ǰ��     ����    �ܰ�      �ݾ�");
		System.out.println("===================================");
		System.out.println();
		for (Sangpum obj : list) {
		
			obj.output();
		}
		System.out.println();
	}//output
	
	static void search_sangpum(LinkedList<Sangpum> list) {
	
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("\n��ȸ�� ��ǰ �Է�  => ");
			String code = in.readLine();
	
			for (Sangpum obj : list) {
			
				if (code.equals(obj.code)) {
					System.out.println();
					System.out.println("��ǰ�ڵ�    ��ǰ��     ����    �ܰ�      �ݾ� ");
					System.out.println("======================================");
					obj.output();
					System.out.println();
					
					return;
				}//if
			  }//for
		}//try 
		catch (IOException e) {
			System.out.println("\n�������� �ʴ� ��ǰ�Դϴ�");
		}//catch
	}//search
	
	static void update_sangpum(LinkedList<Sangpum> list)
	{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.print("\n������ ��ǰ �Է� => ");
		String code = in.readLine();
		
		for (Sangpum obj : list) {
		
			if (code.equals(obj.code)) {
			
				System.out.print("\n���� �Է� => ");
				obj.su = Integer.parseInt(in.readLine());
				System.out.print("�ܰ� �Է� => ");
				obj.dan = Integer.parseInt(in.readLine());
				
				obj.process();
			} //if	
				System.out.println("\n" + code + " ��ǰ ���� �Ϸ�");
				return;
			} //for
		}//try
		catch (IOException e) {
		System.out.println("\n�������� �ʴ� ��ǰ�Դϴ�");
		}//catch	
	}//update
	static void delete_sangpum(LinkedList<Sangpum> list) {
		
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.print("\n������ ��ǰ�ڵ� �Է� => ");
		String code = in.readLine(); //�Է¹��� ��ǰ�ڵ�
		//�ϳ��ϳ� ���´� ��ü�� obj���� �����ϰ� �ȴ�..�̰͵��� ������ ���ϰԵȴ�.(����Ʈ)��ǰ��ü �ȿ� �ִ� �ڵ�� ��
		for (Sangpum obj : list) {
		//equals�� ��� ��ü���� ��밡���� ���̴� ��Ʈ������.equals
		//��ǰ�� ��ȣ �ȿ� �ִ°ſ� ���ϴ°ǵ� ��ǰ�� ������ Ÿ���� ��ǰ�ε� �񱳴���� Ÿ���� string�̶� �ȵ�
		//��ǰ�� �ڿ� �Է¹��� ���� �ڵ�� �񱳸� �ؾ���
		//160�ٿ��� �Է¹��� �ڵ�� �̹� ����Ǿ� �ִ� �ڵ�� ���ؾ���..obj.code���� ��ǰ�ڵ�� ��
			if (code.equals(obj.code)) {
			
				list.remove(obj);
				System.out.println("\n" + code + " ��ǰ ���� �Ϸ�");
				return;
			}//if
		 }//for
		}//try
		catch (IOException e) {
		//���⿣ ���ܰ� �߻��� �͸� �־�� �Ѵ�
			
	
		}//catch
		System.out.println("\n�������� �ʴ� ��ǰ�Դϴ�"); 
	}
	static void sort_sel(LinkedList<Sangpum> list)
	{
		int i, j;
		Sangpum temp;
		
		for (i=0; i<list.size()-1; i++)
		{
			for (j=i+1; j<list.size(); j++)
			{
				if (list.get(i).irum.compareTo(list.get(j).irum) > 0 )
				{
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}//if
			}//for
		}//for
	}//sort

}//end
