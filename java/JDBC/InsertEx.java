package ch20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEx {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.3.217:1521:orcl";
		Connection con = null;
		Statement stmt = null;
		BufferedReader br = null;
		
		String sql = "Insert into member (hakbun, name, addr, phone) Values ";
		String hakbun, name, addr, phone;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Member ���̺� �� �߰��ϱ�");
			System.out.println("�й� �Է� :");
			hakbun = br.readLine();
			System.out.println("�̸� �Է� :");
			name = br.readLine();
			System.out.println("�ּ� �Է� :");
			addr = br.readLine();
			System.out.println("��ȭ��ȣ �Է� :");
			phone = br.readLine();
			
			sql += "('" + hakbun + "', '" + name + "', '" + addr + "', '" + phone + "')"; 
		    System.out.println(sql);
		    Class.forName(driver);
		    Class.forName(driver);
		    con = DriverManager.getConnection(url, "scott", "123456");
		    stmt = con.createStatement();
		    int res = stmt.executeUpdate(sql);
		    if (res == 1)
		    	System.out.println("�����ͺ��̽� ���� ����");
		} catch (Exception e) {
			System.out.println("�����ͺ��̽� ���� ���� = " + e.getMessage());
		} finally {
			try {
				if(stmt != null)
					stmt.close();
				if(con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
