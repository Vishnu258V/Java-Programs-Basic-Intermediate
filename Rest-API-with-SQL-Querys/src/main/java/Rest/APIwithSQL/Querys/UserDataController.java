package Rest.APIwithSQL.Querys;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserDataController {

	@GetMapping("/getData")
	public String getMethod() {
		return "Hello world";
	}
	
	@GetMapping("/api/getAllData")
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
	
	
	
	
	

}
