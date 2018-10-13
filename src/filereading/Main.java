package filereading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		File file = new File("test.txt");
		System.out.println(file.getAbsolutePath());
		String path = file.getAbsolutePath();
		String pathDoubleBackslash = "C:\\Users\\Michael Rentka\\git\\udemy_spring_hibernate\\src\\filereading\\test.txt";
		String fileNameAndExt = "test.txt";
		String fileNameOnly = "test";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(pathDoubleBackslash));	
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
