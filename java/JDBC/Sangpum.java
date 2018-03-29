package SangpumOracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sangpum {
	String code, irum;
	int su, dan, price;

	
	boolean input() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		
		try {

			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@192.168.3.217:1521:orcl";
			String sql = "select count(*) from sangpum where code = ?";
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "123456");
		
			System.out.println("��ǰ�ڵ� �Է� => ");
			code = in.readLine();
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			rs.next();
			//�ߺ� ã��			
			if(rs.getInt(1) != 0) {
				System.out.println("\n��ǰ�ڵ� �ߺ�����\n");
				return true;
			}
			
			System.out.println("��ǰ�� �Է� => ");
			irum = in.readLine();
			System.out.println("���� �Է� => ");
			su = Integer.parseInt(in.readLine());
			System.out.println("�ܰ� �Է� => ");
			dan = Integer.parseInt(in.readLine());
		} catch (IOException e) {
			System.out.println("input : �Է� ���� : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("�����ͺ��̽� ���� ����: " + e.getMessage());			
		}
//��Ʈ�� ����Ʈ oŰ�� import��Ŵ		
		return false;
	}
	void process() {
		price = su * dan;
	}
	
	void output() {	
		System.out.printf("%4s   %3s   %4d    %4d     %5d \n",
			code, irum, su, dan, price);
	}

}
