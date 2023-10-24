package Date_23_12_2022;

import java.io.File;

public class CreatingNewFoldersByusingJava {

	public static void main(String[] args) {

		File newFolderFile = new File("C:\\Users\\VishnuKumaraSwamiVya\\Desktop\\Work report\\New Folder");

		boolean b = newFolderFile.mkdir();

		if (b) {

			System.out.println("Created");
		} else {

			System.out.println("Not Created ");
		}

	}

}
