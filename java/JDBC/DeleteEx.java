package ch20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteEx {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.3.217:1521:orcl";
		Connection con = null;
		Statement stmt = null;
		BufferedReader in = null;
		
		String hakbun = null;	

		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Member ���̺� �� �����ϱ�");
			System.out.println("������ �й� �Է� : ");
			hakbun = in.readLine();
		//"MBC" + 3 = MBC3�� �ߴ� �Ͱ� ���� ����
			String sql = "Delete From member Where hakbun = '" + hakbun + "'";

			System.out.println(sql);			
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "123456");
			stmt = con.createStatement();
			int res = stmt.executeUpdate(sql);
			//�й��� ���� �ϳ��ۿ� ���⿡ res�� �ϳ��� ����Ǿ� 1�� �� ���� �й� �Է½� res�� 0�̶� ���Ž���
			if (res == 1)
				System.out.println("�����ͺ��̽� ���� ���� ����");
			else
				System.out.println("�����ͺ��̽� ���� ���� ����");			
		} catch (Exception e) {
			System.out.println("�����ͺ��̽� ���� ����" + e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}//catch
		}//finally
	}//main
}