package sqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SELECT_Statement {

	public static void main(String[] args) {

		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=employee;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);

			String query = "select * from users";
			String query2 = "select count(distinct  username) from users";
			String query3 = "select  username from users";
			String query4 = "select  username from users where username='salman'";
			String query5 = "select  * from users where username='salman'";
			String query6 = "select  * from users where user_id='107'";
			String query7 = "select distinct  username from users";

			Statement stm = con.createStatement();
			ResultSet rst = stm.executeQuery(query2);

			while (rst.next()) {
				System.out.println(rst.getString(1));
			}

			
			
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
