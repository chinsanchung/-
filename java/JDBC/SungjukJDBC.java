package SungjukOracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SungjukJDBC {

	
	public static void main(String[] args) {
		ArrayList<Sungjuk> list = new ArrayList<Sungjuk>();

		BufferedReader in = null;
		
			try {
			in = new BufferedReader(new InputStreamReader(System.in));
			int menu;
			
			System.out.println("\n*** �޴� ***");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� ����");
			System.out.println("6. ��     ��\n");
			
			System.out.print("�޴� ����(1~6) => ");
			menu = Integer.parseInt(in.readLine());
			
			while (menu == 6) {
				System.out.println("\n���α׷� ����...");
				break;
			}
			
			switch (menu)
			{
				case 1:
					insert_sungjuk(list);
					break;
				case 2:
					select_sungjuk(list);
					break;
				case 3:
					select2_sungjuk(list);
					break;
				case 4:
					update_sungjuk(list);
					break;
				case 5:
					delete_sungjuk(list);
					break;
				default:
					System.out.println("\n�޴��� �ٽ� �����ϼ���!!!");
					break;
			}
		} catch(IOException e ) {
			System.out.println("�Է� ���� " + e.getMessage());
		}  finally {
			try {
				in.close(); //close�ϴٰ��� ���� ���� �� �־ catch�� �ʿ�
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
			}//finally
		}//main
	

	static void insert_sungjuk(ArrayList<Sungjuk> list) {
	
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.3.217:1521:orcl";
		Connection con = null;		
		PreparedStatement pstmt = null;	
		String hakbun, irum, grade;
		int kor, eng, math;
		Sungjuk obj = new Sungjuk();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println();
			System.out.println("�й� �Է� : ");
			hakbun = in.readLine();
			System.out.println("�̸� �Է� : ");
			irum = in.readLine();
			System.out.print("���� �Է� => ");
			kor = Integer.parseInt(in.readLine());
			System.out.print("���� �Է� => ");
			eng = Integer.parseInt(in.readLine());
			System.out.print("���� �Է� => ");
			math = Integer.parseInt(in.readLine());

			String sql = "Insert Into sungjuk (hakbun, irum, kor, eng, math) Values (?, ?, ?, ?, ?)";
			System.out.println(sql);
		    Class.forName(driver);
		    con = DriverManager.getConnection(url, "scott", "123456");
		    
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, hakbun);
			pstmt.setString(2, irum);
			pstmt.setInt(3, kor);
			pstmt.setInt(4, eng);
			pstmt.setInt(5, math);
			int res = pstmt.executeUpdate();
			if (res == 1)
				System.out.println("���� �Է� ����");
			else
				System.out.println("���� �Է� ����");
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
		System.out.println();

		obj.process();
		list.add(obj);
	}
	
	static void select_sungjuk(ArrayList<Sungjuk> list)
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.3.217:1521:orcl";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Sungjuk obj = new Sungjuk();
		String sql = "Select * from sungjuk";
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "123456");
			stmt = con.createStatement();
		//���̺� ������ ResultSet ��ȯ
			rs = stmt.executeQuery(sql);
		
		System.out.println();
		System.out.println("\n                       *** ����ǥ ***");
		System.out.println("============================================================");
		System.out.println("�й�    �̸�     ����    ����    ����    ����    ���    ���");
		System.out.println("============================================================");
		
		while (rs.next()) {
			String hakbun = rs.getString("hakbun");
			String irum = rs.getString("irum");
			int kor = rs.getInt("kor");
			int eng = rs.getInt("eng");
			int math = rs.getInt("math");
			int total = rs.getInt("total");
			String grade = rs.getString("grade");
			obj.output();
			}
			System.out.println();
		//while
	} catch (Exception e) {
		System.out.println("�����ͺ��̽� ���� ����");
		e.printStackTrace();
	} finally {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}//finally

	}//main
	
	static void select2_sungjuk(ArrayList<Sungjuk> list)
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.print("\n��ȸ�� �й� �Է�  => ");
		String hakbun = in.readLine();

		for (Sungjuk obj : list)
		{
			if (hakbun.equals(obj.hakbun))
			{
				System.out.println();
				System.out.println("�й�    �̸�     ����    ����    ����    ����    ���    ���");
				System.out.println("============================================================");
				obj.output();
				System.out.println("============================================================");				
				return;
			}
		}
		System.out.println("\n�������� �ʴ� �й��Դϴ�!!!");
		} catch (IOException e) {
			System.out.println("���� " + e.getMessage());
		}  finally {
			try {
				in.close(); //close�ϴٰ��� ���� ���� �� �־ catch�� �ʿ�
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}//finally
	}//insert

	
	static void update_sungjuk(ArrayList<Sungjuk> list) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.3.217:1521:orcl";
		Connection con = null;		
		PreparedStatement pstmt = null;	
	
		String hakbun, irum;
		int kor, eng, math;
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("������ �й� �Է� : ");
			hakbun = in.readLine();
			System.out.println("�� �̸� �Է� : ");
			irum = in.readLine();
			System.out.print("�� ���� ���� �Է� => ");
			kor = Integer.parseInt(in.readLine());
			System.out.print("�� ���� ���� �Է� => ");
			eng = Integer.parseInt(in.readLine());
			System.out.print("�� ���� ���� �Է� => ");
			math = Integer.parseInt(in.readLine());

			String sql = "Update sungjuk Set irum = ?, kor = ?, eng = ?, math = ? Where hakbun = ?";
			System.out.println(sql);
		    Class.forName(driver);
		    con = DriverManager.getConnection(url, "scott", "123456");
		    
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, irum);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, math);
			pstmt.setString(5, hakbun);
			int res = pstmt.executeUpdate();
			if (res == 1)
				System.out.println("�����ͺ��̽� ���� ���� ����");
			else
				System.out.println("�����ͺ��̽� ���� ���� ����");
		} catch (Exception e) {
		System.out.println("\n�������� �ʴ� �й��Դϴ�!!!");
	   } finally {
			try {
				if(pstmt != null)
					pstmt.close();
				if(con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
	   }//finally
	}//update
	static void delete_sungjuk(ArrayList<Sungjuk> list) {
		Connection con = null;		
		PreparedStatement pstmt = null;	
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.3.217:1521:orcl";
		
		String hakbun = null;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("sungjuk ���̺� �� �����ϱ�");
			System.out.println("������ �й� �Է� : ");
			hakbun = in.readLine();
			//�й��� ���� 5�ڸ��ε� 3�ڸ� �Է��ϸ� ���� ���ܼ� �� ���� �����Ϸ��� trim ���(�¿��� ���� ����)
			//���� ���ϸ� ���� ���� ���� ���� ���ڶ��� ���ؼ�, ������(��������)�� ���� ���̶�� �ν� ����
			String sql = "Delete From sungjuk Where trim(hakbun) = ?";
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
	}//delete

 }
