package FinalRest.APIwithSQL.Querys;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeDataController {

	@GetMapping("/RestAPI/getAllData")
	public ResponseEntity<List<String>> gettingUsertData() {
		
		List<String> li = new ArrayList<>();
		li.add("Vishnu");
		li.add("Vishnu");
		li.add("Vishnu");
		li.add("Vishnu");
		li.add("Vishnu");
		li.add("Vishnu");
		li.add("Vishnu");
		li.add("Vishnu");
		
		
		return new ResponseEntity<>(li, HttpStatus.OK);
	} 
	
	
	@GetMapping("/getData")
	public ResponseEntity<String> getMethod() {
		
		String s = "vishnu";
		return new ResponseEntity<>(s,HttpStatus.OK);
	}
	
	
	
	
}
