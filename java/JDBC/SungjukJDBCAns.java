package SungjukOracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SungjukJDBCAns {

	public static void main(String[] args) {
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		
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
			
			
			switch (menu)
			{
				case 1:
					input_sungjuk();
					break;
				case 2:
					output_sungjuk();
					break;
				case 3:
					search_sungjuk();
					break;
				case 4:
					update_sungjuk();
					break;
				case 5:
					delete_sungjuk();
					break;
				case 6:
					System.out.println("\n���α׷� ����");
					break;
				default:
					System.out.println("\n�޴��� �ٽ� �����ϼ���!!!");
					break;
			}//switch
			if (menu == 6) {
				break;
				}//if
			}//while
		} catch (IOException e) {
			System.out.println("�Է� ���� : " + e.getMessage());
		} finally {
			try {
				in.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			}//catch
		}//finally
	}//main	
	//input���� Ȱ���Ұ���..ȣ��� ���� ��ü �Ҵ���� �� con ��ȯ(return con)
	static Connection getconnectDB() {
		Connection con = null;
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@192.168.3.217:1521:orcl";
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "123456");
		} catch(Exception e) {
			System.out.println("�����ͺ��̽� ���� ����");
			e.printStackTrace( );
		}
		return con;
	}//getconnectDB()
	
	static void input_sungjuk() {

		Sungjuk obj = new Sungjuk();

		System.out.println();
		obj.input();
		obj.process();

		Connection con = getconnectDB();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO SUNGJUK (hakbun, irum, kor, eng, math, total, avg, grade) VALUES (?,?,?,?,?,?,?,?)";
		// String sql = "insert into sungjuk(hakbun, irum, kor, eng, math, tot, avg,
		// grade)" + " values (?,?,?,?,?,?,?,?)";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, obj.hakbun);
			pstmt.setString(2, obj.irum);
			pstmt.setInt(3, obj.kor);
			pstmt.setInt(4, obj.eng);
			pstmt.setInt(5, obj.math);
			pstmt.setInt(6, obj.total);
			pstmt.setDouble(7, obj.avg);
			pstmt.setString(8, obj.grade);

			int res = pstmt.executeUpdate();
			if (res == 1)
				System.out.println("\n ���� �Է� ����!");

		} catch (Exception e) {
			System.out.println("�����ͺ��̽� ���� ����! = " + e.getMessage());

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
	}//input
	
	static void output_sungjuk() {
		Connection con = null;
	//�ϳ��� ���� ã�� �ϳ��� �Ϲ� ���	
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
	//���� ���̺� ������ ���� ã��..������ 0
		String sql1 = "select count(*) from sungjuk";
		String sql2 = "select * from sungjuk order by hakbun";
		
		try {
			Sungjuk obj = new Sungjuk();
			con = getconnectDB();
			
			pstmt1 = con.prepareStatement(sql1);
			rs1 = pstmt1.executeQuery();
			rs1.next();
		//�ʵ��� ��ġ�� �ش� ������ �о ���� 0(�߰������� ����)�̸� ��¾���
			if (rs1.getInt(1) == 0) {
				System.out.println("\n����� �����Ͱ� ����\n");
			} else {
				pstmt2 = con.prepareStatement(sql2);
				rs2 = pstmt2.executeQuery();
				
				System.out.println();
				System.out.println("\n                       *** ����ǥ ***");
				System.out.println("============================================================");
				System.out.println("�й�    �̸�     ����    ����    ����    ����    ���    ���");
				System.out.println("============================================================");
		//printf�� �ص� ����� ����		
				while(rs2.next()) {
					obj.hakbun = rs2.getString("hakbun");
					obj.irum = rs2.getString("irum");
					obj.kor = rs2.getInt("kor");
					obj.eng = rs2.getInt("eng");
					obj.math = rs2.getInt("math");
					obj.total = rs2.getInt("total");
					obj.avg = rs2.getInt("avg");
					obj.grade = rs2.getString("grade");
					obj.output();
					}//while
				System.out.println("============================================================");
				}//else
		} catch (Exception e) {
			System.out.println("���� ��� ���� = " + e.getMessage());
		} finally {
			try {
				if(rs1 != null) rs1.close();
				if(rs2 != null) rs2.close();
				if(pstmt1 != null) pstmt1.close();
				if(pstmt2 != null) pstmt2.close();
				if(con != null) con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage( ));
			} 
		}//finally
	}//output
	
	static void search_sungjuk() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from sungjuk where hakbun = ?";
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("\n��ȸ�� �й� �Է� => ");
			String hakbun = in.readLine();
			
			con = getconnectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, hakbun);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				System.out.println();
				System.out.println("�й� : " + rs.getString("hakbun"));
				System.out.println("�̸� : " + rs.getString("irum"));
				System.out.println("���� : " + rs.getInt("kor"));
				System.out.println("���� : " + rs.getInt("eng"));
				System.out.println("���� : " + rs.getInt("math"));
				System.out.println("���� : " + rs.getInt("total"));
				System.out.println("��� : " + rs.getDouble("avg"));
				System.out.println("��� : " + rs.getString("grade"));
			} else {
				System.out.printf("\n%s�� �������� �ʴ� �й�\n", hakbun);
			}
		} catch (Exception e) {
			System.out.println("���� ��ȸ ���� = " + e.getMessage());
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally		
	}//search
	
	static void update_sungjuk() {
		
		Sungjuk obj = new Sungjuk();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "update sungjuk set kor = ?, eng = ?, math = ?, total = ?,"
				+ " avg = ?, grade = ? where hakbun = ?";
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("\n������ �й� �Է� => ");
			obj.hakbun = in.readLine();
			System.out.println("���� �Է� => ");
			obj.kor = Integer.parseInt(in.readLine());
			System.out.println("���� �Է� => ");
			obj.eng = Integer.parseInt(in.readLine());
			System.out.println("���� �Է� => ");
			obj.math = Integer.parseInt(in.readLine());
			
			obj.process();
			
			con = getconnectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, obj.kor);
			pstmt.setInt(2, obj.eng);
			pstmt.setInt(3, obj.math);
			pstmt.setInt(4, obj.total);
			pstmt.setDouble(5, obj.avg);
			pstmt.setString(6, obj.grade);
			pstmt.setString(7, obj.hakbun);
			int res = pstmt.executeUpdate();
			if (res == 1)
				System.out.println("\n" + obj.hakbun + " �й� ���� �Ϸ�");
			else
				System.out.printf("\n%s�� �������� �ʴ� �й�\n", obj.hakbun);
		} catch(Exception e) {
			System.out.println("���� ���� ���� = " + e.getMessage());
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
	}//update
	
	static void delete_sungjuk() {
			
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "delete from sungjuk where hakbun = ?";
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("\n������ �й� �Է� => ");
			String hakbun = in.readLine();
			
			con = getconnectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, hakbun);
			int res = pstmt.executeUpdate();
			if (res == 1)
				System.out.println("\n" + hakbun + " �й� ���� �Ϸ�");
			else
				System.out.printf("\n%s�� �������� �ʴ� �й�\n", hakbun);
		} catch (Exception e) {
			System.out.println("���� ���� ���� = " + e.getMessage());			
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage( ));
			}
		}//finally
	}//delete
}
