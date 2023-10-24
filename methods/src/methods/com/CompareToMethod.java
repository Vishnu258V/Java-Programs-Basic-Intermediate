package methods.com;

public class CompareToMethod {

	public static void main(String[] args) {
//   Compare to method returns either 
//		 |  0  =>  same 
//		 | -1  =>  (a<b)
//		 |  1  =>  (a>b)
		
		int a = 10;
		int b = 10;
		int c = 20;
		
		String s1 = "Hello";
		String s2 = "hello";
		String s3 = null;
		
		System.out.println(Integer.compare(a,b));  // it will give  =   0

		System.out.println(Integer.compare(b, c)); // it will give  =  -1
		
		System.out.println(Integer.compare(c, a)); // it will give  =   1
		
		
		// it will not give compilation error
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		// compilation error
		System.out.println(s3.equals(s1));
		
		
		
	}

}
