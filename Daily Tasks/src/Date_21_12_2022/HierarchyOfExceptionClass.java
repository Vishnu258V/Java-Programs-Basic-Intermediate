package Date_21_12_2022;

class Student {
	String name;
	int rollNum;

	public void showData() throws Exception {
		System.out.println("Name = " + name + "\nRoll Number = " + rollNum);
	}

}

class college extends Student {

	public void showData() throws ArithmeticException {
		System.out.println("Name = " + name + "\nRoll Number = " + rollNum + "\nCollege name = ");
	}
}

public class HierarchyOfExceptionClass {

	public static void main(String[] args) throws ArithmeticException {

		college c1 = new college();
		c1.showData();

	}
}
