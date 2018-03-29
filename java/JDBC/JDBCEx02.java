package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx02 {
//sql���� commit �ؾ߸� ����� ���
	public static void main(String[] args) {
		//���� ��ü, ������Ʈ��Ʈ, ��� ��ü
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.3.217:1521:orcl", "scott", "123456");
			//������Ʈ��Ʈ ��ü �Ҵ�
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select code, name, price, maker from goodsinfo");
			System.out.println("��ǰ�ڵ� ��ǰ�� \t\t���� ������");
			System.out.println("------------------------------------");
			//next�� ������ �࿡ ����, �ݺ�-> �� �̻� ������ false�� ��������
			while (rs.next()) {
				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				System.out.printf("%8s %s \t%12d %s%n", code, name, price, maker);
			}//while
		} 
		//Class.forName���� ����
		catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� ����" + cnfe.getMessage());
		} 
		//���� finally�� �����ε�
		catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		//���������� ���� �� ���� ���� �� �ֱ� ������ try�� ���		
		finally {
			try {
				rs.close();
			} catch (Exception ignored) {
			} 
			try {
				stmt.close();
			} catch (Exception ignored)	{
				
			} try {
				conn.close();
			} catch (Exception ignored) {
				
			}//catch
		}//finally

	}//main

}
