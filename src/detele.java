import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class detele {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("加载成功");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("加载异常");
		try {
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studb", "root", "admin");
			System.out.println("连接成功");
			Statement sta = (Statement) con.createStatement();
			int n = sta.executeUpdate("delete from studentinfo where password='41'");
			System.out.println("删除成功" + n + "条");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接异常");
			e.printStackTrace();
		}

	}

}
