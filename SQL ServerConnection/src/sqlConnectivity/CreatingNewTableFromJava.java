package sqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class CreatingNewTableFromJava {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=employee;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";

			String query2 = "CREATE TABLE usersData (\r\n" + "    user_id int IDENTITY(101, 1) NOT NULL ,\r\n"
					+ "    username varchar(45) NOT NULL,\r\n" + "    password varchar(45) NOT NULL,\r\n"
					+ "    fullname varchar(45) NOT NULL,\r\n" + "    email varchar(45) NOT NULL,\r\n"
					+ "    PRIMARY KEY (user_id)\r\n" + "); ";

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);

			// Using a statement interface we can create and execute the SQL query
			Statement stm = con.createStatement();
			int result = stm.executeUpdate(query2);

			if (result == 0) {
				System.out.println("Created 😊 😊");

			} else {
				System.out.println("Not Created 😒");
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
