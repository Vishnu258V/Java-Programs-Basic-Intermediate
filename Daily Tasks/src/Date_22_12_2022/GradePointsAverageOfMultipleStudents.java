package Date_22_12_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class studentDetails {

	private String name;
	private int rollNumber;

	public studentDetails(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

}

class subjects_Grades extends studentDetails {

	public subjects_Grades(String name, int rollNumber) {
		super(name, rollNumber);
	}

	ArrayList<String> sub = new ArrayList<>();
	ArrayList<Character> grade = new ArrayList<>();

	public void addSubGrades(String s, char g) {
		sub.add(s);
		grade.add(g);
	}

	public double GPA() {
		double totalGrade = 0.0;

		for (Character c : grade) {
			char grades = c;

			switch (grades) {
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

			case 'a':
				totalGrade = totalGrade + 4;
				break;

			case 'b':
				totalGrade = totalGrade + 3;
				break;

			case 'c':
				totalGrade = totalGrade + 2;
				break;

			case 'd':
				totalGrade = totalGrade + 1;
				break;

			case 'f':
				totalGrade = totalGrade + 0;
				break;

			}
		}
		double avaerageGrade = totalGrade / sub.size();

		return avaerageGrade;
	}

	@Override
	public String toString() {

		return "\nName of the Student - " + getName() + "\nRoll Number - " + getRollNumber()
				+ "\nThe Average Grade poits - " + GPA() + "\nBy considering these subjects:" + "\n" + sub;
	}

}
public class GradePointsAverageOfMultipleStudents {
	public static void main(String[] args) {

		subjects_Grades anji = new subjects_Grades("Anji", 1047);
		anji.addSubGrades("Maths", 'A');
		anji.addSubGrades("English", 'a');
		anji.addSubGrades("Science", 'B');
		anji.addSubGrades("Social", 'B');
		anji.addSubGrades("polity", 'A');
		System.out.println(anji.toString());

		subjects_Grades vishnu = new subjects_Grades("Vishnu", 342);
		vishnu.addSubGrades("Maths", 'b');
		vishnu.addSubGrades("English", 'a');
		vishnu.addSubGrades("Science", 'c');
		vishnu.addSubGrades("Social", 'B');
		vishnu.addSubGrades("Telugu", 'A');
		System.out.println(vishnu.toString());

	}
}
