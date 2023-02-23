package filesoperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readingByteFromFile();
	}
	static void readingByteFromFile() {
		try {
			File file=new File("c:/files/demo.txt");
		//FileInputStream reader=new FileInputStream(new File("c:/files/demo.txt"));
			FileInputStream reader=new FileInputStream(file);
		int pos;
		while((pos=reader.read())!=-1) {
			System.out.print((char)pos);
		}
		System.out.println("\n Reading Done.....");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
