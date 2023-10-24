package Date_23_12_2022;

import java.io.File;
import java.io.IOException;

public class FileAddingToJavaProgram {
	public static void main(String[] args) throws IOException {

		
		File newFile = new File("C:\\Users\\VishnuKumaraSwamiVya\\Desktop\\Work report\\file by java");
		
		boolean b = newFile.createNewFile();
		
		if(b ) {
			System.out.println("File Created");
		}else {
			System.out.println("Not Created");
		}
		
		
	}

}
