package lastOneRest.APIwithSQL.Querys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerEmployeeData {

	@GetMapping("/hello")
	@ResponseBody
	public String getHello() {
		String s = "Hello vishnu";
		return s ;
	}
	
	@GetMapping("/RstAPI/getAllEmployees")
	@ResponseBody
	public Map<String, employeeData> getAlldata(){
		
		HashMap<String, employeeData> getData = new HashMap<>();

		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=employee;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);

			String query = "select * from employeeData";


			Statement stm = con.createStatement();
			ResultSet rst = stm.executeQuery(query);

			while (rst.next()) {
				getData.put( rst.getString(1),new employeeData(rst.getString(1), rst.getString(2),
						rst.getString(3), rst.getString(4), rst.getLong(5), rst.getString(6)));
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		
		return getData;
		
	}
	
	
	
	
	
	
	
	
	
}
