package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCEx01 {

	public static void main(String[] args) {
		Connection conn = null;
		try { 
		 //1. �����ͺ��̽� �ε�
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		 //2. ���� ��ü conn ����
		  conn = DriverManager.getConnection(
				  //�ڽ��� ip�� �Ұ�
				  "jdbc:oracle:thin:@192.168.3.217:1521:orcl", "scott", "123456");
		  System.out.println("�����ͺ��̽��� ����");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� ����" + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
		//3. �ݵ�� �ݱ�
				conn.close();			
		} catch (Exception ignored) {
		   }
		}//finally

	}//main

}
