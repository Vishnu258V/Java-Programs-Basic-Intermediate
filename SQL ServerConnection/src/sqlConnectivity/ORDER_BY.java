package sqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ORDER_BY {

	@SuppressWarnings("unused")
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

			// ORDER BY in Asscending order
			String query1 = "select * from employeeData order by e_salary";
			String query2 = "select e_name,e_salary from employeeData order by e_salary ";
			String query3 = "select e_name,e_salary from employeeData where e_department = 'development' order by e_salary ";
			String query4 = "select e_name,e_salary from employeeData where e_department = 'development' order by e_salary ";

			// ORDER BY in Descending order
			String query5 = "select * from employeeData order by e_age desc ";
			String query6 = "select e_name,e_salary from employeeData where e_age < 25  order by  e_salary desc";

			// ORDER BY, by using several columns
			String query7 = "select * from employeeData order by e_salary, e_age ";
			String query = "select e_name,e_salary from employeeData order by e_salary, e_name desc";

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
