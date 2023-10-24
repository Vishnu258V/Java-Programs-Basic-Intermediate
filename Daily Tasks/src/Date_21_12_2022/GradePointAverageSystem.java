package Date_21_12_2022;

import java.util.HashMap;

// Grades   A     B    C    D    F
//          |	  |	   |    |    |
// points   4	  3    2    1	 0

class Student1 {

	String studentName;
	int rollNumber;

	public Student1(String studentName, int rollNumber) {
		this.studentName = studentName;
		this.rollNumber = rollNumber;
	}
}

class SubjectsAndGrades extends Student1 {

	int totalGrade = 0;

	public SubjectsAndGrades(String studentName, int rollNumber) {
		super(studentName, rollNumber);
	}

	public void subAndGrades() {
		HashMap<String, Character> subGrades = new HashMap<>();
		subGrades.put("Englis", 'A');
		subGrades.put("Maths", 'B');
		subGrades.put("Science", 'C');
		subGrades.put("Social", 'C');
		subGrades.put("Polity", 'D');

		for (Character c : subGrades.values()) {
			char grade = c;

			switch (grade) {
			case 'A':
				totalGrade = totalGrade + 4;
				break;

			case 'B':
				totalGrade = totalGrade + 3;
				break;

			case 'C':
				totalGrade = totalGrade + 2;
				break;

			case 'D':
				totalGrade = totalGrade + 1;
				break;

			case 'F':
				totalGrade = totalGrade + 0;
				break;

			}
		}
		int averageGrade = totalGrade / subGrades.size();

		char tempFinalGrade = ' ';
		if (averageGrade >= 2) {

			switch (averageGrade) {
			case 1:
				tempFinalGrade = 'D';
				break;

			case 2:
				tempFinalGrade = 'C';
				break;

			case 3:
				tempFinalGrade = 'B';
				break;

			case 4:
				tempFinalGrade = 'A';
				break;
			}

			System.out.println("Name of the Student  - " + studentName + "\nRoll Number  - " + rollNumber);
			System.out.println("Pass with final grade - " + tempFinalGrade);

		} else {
			System.out.println("FAIL");
		}

		System.out.println("\nsubject Grades \n--------------");

		for (String s : subGrades.keySet()) {

			System.out.println(s + "  - " + subGrades.get(s));
		}

	}

}

public class GradePointAverageSystem {
	public static void main(String[] args) {

		SubjectsAndGrades s1 = new SubjectsAndGrades("Vishnu", 342);

		s1.subAndGrades();

	}
}
