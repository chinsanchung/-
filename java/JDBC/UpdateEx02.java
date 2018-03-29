package ch20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEx02 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.3.217:1521:orcl";
		Connection con = null;		
		PreparedStatement pstmt = null;	
		
		String sql = "Update member Set (?, ?, ?)";
		String hakbun, addr, phone;
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Member ���̺� �� �����ϱ�");
			System.out.println("������ �й� �Է� : ");
			hakbun = in.readLine();
			System.out.println("�� �ּ� �Է� : ");
			addr = in.readLine();
			System.out.println("�� ��ȭ��ȣ �Է� : ");
			phone = in.readLine();
			
			System.out.println(sql);
		    Class.forName(driver);
		    con = DriverManager.getConnection(url, "scott", "123456");
		    
		    pstmt = con.prepareStatement(sql);
		    pstmt.setString(1, hakbun);
		    pstmt.setString(2, addr);
		    pstmt.setString(3, phone);
		    
		    int res = pstmt.executeUpdate();
		    
		    if (res == 1)
		    	System.out.println("���� ����");
		    else
		    	System.out.println("���� ����");		    
		} catch (Exception e) {
			System.out.println("�����ͺ��̽� ���� ���� = " + e.getMessage());
		} finally {
			try {
				if(pstmt != null)
					pstmt.close();
				if(con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}//catch
		}//finally
	}//main
}

