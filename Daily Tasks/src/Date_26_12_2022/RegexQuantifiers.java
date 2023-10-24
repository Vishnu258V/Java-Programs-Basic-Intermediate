package Date_26_12_2022;

import java.util.regex.Pattern;

public class RegexQuantifiers {

	public static void main(String[] args) {
		
 //  { ? } Question Mark - Quantifier   -	 Matches zero or one preceding character.
	System.out.println("Qestion mark quantifier =>  ( ? ) ");
	System.out.println(Pattern.matches("abc?", "abc"));
	System.out.println(Pattern.matches("[abc]?", "a"));
	System.out.println(Pattern.matches("abc?", "b"));
	System.out.println(Pattern.matches("abc?", "cb"));
	System.out.println(Pattern.matches("[abc]?", "abc"));

	
	System.out.println("\nAsterisk Quantifier  =>  ( * )");
	System.out.println(Pattern.matches("Vishnu*", "V"));
	System.out.println(Pattern.matches("(\\d*).(\\D*)","12345-Vishnu"));
	System.out.println(Pattern.matches("Vishnu*", "vishnu"));
	System.out.println(Pattern.matches("[Vishnu]*", "Vishnu"));
	System.out.println(Pattern.matches("Vishnu*", "Vishnu"));
	System.out.println(Pattern.matches(".?([2-9]{1}(0-9){2}).?","789"));
		
	
	}
}
