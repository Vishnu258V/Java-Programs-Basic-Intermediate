package sqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataToTheTableFromJAva {
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

			String insertQuery = "insert into users" 
					+ " values('Anji','Anji@123','Anjaneyulu','Anji@gmail.com'),"
					+ "('Rohan','Rohan@123','Rohan Bagde','Rohan@gmail.com'),"
					+ "('salman','salman@123','salman sultan','salman@gmail.com'),"
					+ "('shiv','shiv@123','shiv','shiv@gmail.com'),"
					+ "('kavya','kavya@123','kavya ','kavya@gmail.com');";

			Statement stm = con.createStatement();
			int result = stm.executeUpdate(insertQuery);

			if (result == 1) {

				System.out.println("Inserted");
			} else {
				System.out.println("Not Inserted");
			}

			con.close();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
