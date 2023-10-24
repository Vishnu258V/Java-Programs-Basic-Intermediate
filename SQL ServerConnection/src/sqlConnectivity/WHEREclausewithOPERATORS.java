package sqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class WHEREclausewithOPERATORS {

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
			
			//where
			String query1 = "select * from employeeData where e_age > 22 ";
			
			//AND
			String query2 = "select * from employeeData where e_age > 22 and e_age < 25 ";
			String query3 = "select * from employeeData where e_age > 22 and e_department = 'development' ";
			String query4 = "select e_name,e_salary from employeeData where e_age > 22 and e_department = 'development'";
			
			//OR
			String query5 = "select * from employeeData where e_department='development' OR e_salary > 15000 ";
			String query6 = "select * from employeeData where e_department='testing' OR e_salary < 15000 ";
			
			//NOT
			String query7 = "select * from employeeData where not e_department='development' ";
			String query8 = "select * from employeeData where not e_department='CEO' and e_salary > 20000";
			
			//LIKE
			String query9 = "select * from employeeData where e_name like '%v'";
			String query10 = "select * from employeeData where e_name like 'v%'";
			String query = "select * from employeeData where e_name like '%v'";
			
			Statement stm = con.createStatement();
			ResultSet rst = stm.executeQuery(query);

			while (rst.next()) {
				System.out.println(rst.getString(1) + " " + rst.getString(2) + " " + rst.getString(3) + " "
						+ rst.getString(4) + " " + rst.getString(5)+ " " + rst.getString(6));
			}
			
			
			con.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
