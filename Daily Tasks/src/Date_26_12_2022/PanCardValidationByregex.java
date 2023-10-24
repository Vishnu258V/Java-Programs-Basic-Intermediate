package Date_26_12_2022;

import java.util.regex.Pattern;

//It should be ten characters long.
//The first five characters should be any upper case alphabets.
//The next four-characters should be any number from 0 to 9.
//The last(tenth) character should be any upper case alphabet.
//It should not contain any white spaces.


class pancard {

	public void panValidation(String pancardNumber) {
		
		boolean b = Pattern.matches("([A-Z]{5})([0-9]{4})([A-Z]{1})", pancardNumber);
		
		if (b) {
			System.out.println("\nValid PAN Card Number!");
		} else {
			System.out.println("\nInvalid PAN Card Number!");
		}
	}
		
}

public class PanCardValidationByregex {

	public static void main(String[] args) {
      
        String str1 = "BNZAA2318J";
        String str2 = "23ZAABN18J";
        String str3 = "BNZAA2318JM";
        String str4 = "BNZAA23184";
        String str5 = "BNZAA 23184";
        
        
        
        pancard result = new pancard();
        
        result.panValidation(str5);
        result.panValidation(str4);
        result.panValidation(str3);
        result.panValidation(str2);
        result.panValidation(str1);
        
        
        
        
        
        
		
	}
}
