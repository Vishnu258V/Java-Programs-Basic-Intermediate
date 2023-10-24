package Date_23_12_2022;

import java.io.File;
import java.io.IOException;

public class CreatingFileInsideNewFolder {

	public static void main(String[] args) {

		File fileWithMessege = new File("C:\\Users\\VishnuKumaraSwamiVya\\Desktop\\Work report\\new one for file");

		// Creating the folder inside a folder
		boolean b = fileWithMessege.mkdirs();

		// System.out.println(b);

		if (b) {
			System.out.println("New folder created ");
		} else {
			System.out.println("New folder not created ");
		}

		// to get the path of the created folder
		String s = null;
		try {
			s = fileWithMessege.getCanonicalPath();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// Creating a new file inside the new folder which is going to be from above
		// lines of code
		File newFile = new File(s + "\\text file");
		try {
			boolean f = newFile.createNewFile();

			if (f) {
				System.out.println("New file created inside the new folder");
			} else {
				throw new IOException("New file-not created inside the new folder");
			}         
			

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

//		if (f) {
//			System.out.println("New file created inside the new folder");
//		} else {
//			System.out.println("new file not-created inside the new folder");
//		}

	}
}
