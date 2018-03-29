package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEx {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
		//JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//�����ͺ��̽� ����
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.3.217:1521:orcl", "scott", "123456");
		//������Ʈ��Ʈ ��ü stmt �Ҵ�
			stmt = conn.createStatement();
		//executeQuery �޼ҵ� ȣ��
			rs = stmt.executeQuery("select hakbun, name, addr, phone from member");
			System.out.println("hakbun   name   addr     phone");
			System.out.println("------------------------------------");
		//next�޼ҵ� ȣ��..���̻� �θ��� ���������� + get~~���� Ư�� �÷� �� ������
			while (rs.next()) {
				String code = rs.getString("hakbun");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String phone = rs.getString("phone");
				System.out.printf("%8s %3s %5s     %9s", code, name, addr, phone);
				System.out.println();
			}//while
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� ����" + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		//���������� ���� �� ���� ���� �� �ֱ� ������ try�� ���
		} finally {
			try {
				rs.close();
			} catch (Exception ignored) {

			} try {
				stmt.close();
			} catch (Exception ignored)	{
				
			} try {
				conn.close();
			} catch (Exception ignored) {
				
			}//catch
		}//finally
	}//main

}
