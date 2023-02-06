package exceptiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsExample01 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\abc.txt");
		FileInputStream stream=new FileInputStream(file);
	}

}
