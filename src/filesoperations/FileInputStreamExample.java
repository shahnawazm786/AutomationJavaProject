package filesoperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		writingByteIntoFile();
		readingByteFromFile();
	}
	static void readingByteFromFile() {
		try {
			File file=new File("c:/files/demo1.txt");
		//FileInputStream reader=new FileInputStream(new File("c:/files/demo.txt"));
			FileInputStream reader=new FileInputStream(file);
		int pos;
		while((pos=reader.read())!=-1) {
			System.out.print((char)pos);
		}
		System.out.println("\n Reading Done.....");
		reader.close();
		}catch(IOException ex) {
			ex.printStackTrace();
			
		}
	}
	static void writingByteIntoFile() {
		try {
		FileOutputStream output=new FileOutputStream(new File("c:/files/demo1.txt"));
		byte[] b={'h','e','l','l','o'};
		output.write(b);
		output.close();
		System.out.println("Writing done successfully......");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
