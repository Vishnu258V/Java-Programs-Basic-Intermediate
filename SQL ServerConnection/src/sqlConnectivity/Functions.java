package sqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Functions {
	public static void main(String[] args) {

		Connection con = null;
		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=employee;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";

			// registering or loading the connection
			con = DriverManager.getConnection(url, passwrd, userName);

			String query = "select min(e_age), max(e_age) from employeeData";

			Statement stm = con.createStatement();
			ResultSet rst = stm.executeQuery(query);

//			while (rst.next()) {
//				System.out.println(rst.getString(1) + " - " + rst.getString(2) + " - " + rst.getString(3) + " - "
//						+ rst.getString(4) + " - " + rst.getString(5)+ " - " + rst.getString(6));
//			}

			
			
			
			while (rst.next()) {
				System.out.println(rst.getString(1) + " - " + rst.getString(2));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}
}
