package filesoperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperationsExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("c:/files/test.txt");
			fw.write("Hello!! I am writing into file");
			System.out.println("Writing happened successful");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileReader fr=new FileReader("c:/files/test.txt");
		int ch;
		while( (ch= fr.read())!=-1) {
			System.out.println((char)ch);
			
		}
		fr.close();

	}

}
