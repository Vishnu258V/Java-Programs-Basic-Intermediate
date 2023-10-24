package Date_23_12_2022;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WritingMessegToFile {

//	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File wrt = new File("C:\\Users\\VishnuKumaraSwamiVya\\Desktop\\Work report\\new one for file\\text file.txt");

		String path = wrt.getAbsolutePath();

		try (FileWriter fwrt = new FileWriter(path)) {
		fwrt.write("REST use Uniform Service locators febhd sdbvhwbyifb wiughuigw wegwbeijgbkjencweuh vvbivbw ");
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
			
	try(FileInputStream input = new FileInputStream(wrt)) {	
		
		System.out.println(input.read());

	} catch (IOException e1) {
		
		System.out.println(e1.getMessage());
	}
		
	}
}
