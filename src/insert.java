import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class insert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���سɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���쳣");
			e.printStackTrace();
		}
		try {
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studb", "root", "admin");
			System.out.println("���ӳɹ�");
			Statement sta = (Statement) con.createStatement();
		int n= sta.executeUpdate("insert studentinfo values('l','3')");
		System.out.println("����"+n+"��");
		
			
			ResultSet rs = (ResultSet) sta.executeQuery("select*from studentinfo");
			while (rs.next()) {
				String username = rs.getString("unsername");
				String password = rs.getString("password");
				System.out.println(username + password);
				 
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("�����쳣");
			e.printStackTrace();
		}

	}
}
