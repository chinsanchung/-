package ch20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteExAns {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.3.217:1521:orcl";
		Connection con = null;		
		PreparedStatement pstmt = null;	
		
		String hakbun = null;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Member ���̺� �� �����ϱ�");
			System.out.println("������ �й� �Է� : ");
			hakbun = in.readLine();
			//�й��� ���� 5�ڸ��ε� 3�ڸ� �Է��ϸ� ���� ���ܼ� �� ���� �����Ϸ��� trim ���(�¿��� ���� ����)
			//���� ���ϸ� ���� ���� ���� ���� ���ڶ��� ���ؼ�, ������(��������)�� ���� ���̶�� �ν� ����
			String sql = "Delete From member Where trim(hakbun) = ?";
			System.out.println(sql);
		    
			Class.forName(driver);
		    con = DriverManager.getConnection(url, "scott", "123456");	
		    
		    pstmt = con.prepareStatement(sql);
		    pstmt.setString(1, hakbun.trim());
		    
		    int res = pstmt.executeUpdate();
		    if (res == 1) 
		    	System.out.println("�����ͺ��̽� ���� ����");
		    else
		    	System.out.println("�����ͺ��̽� ���� ����");
	}catch (Exception e) {
		System.out.println("�����ͺ��̽� ���� ���� = " + e.getMessage());
	} finally {
		try {
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
	}//catch
  }//finally
}//main
}
