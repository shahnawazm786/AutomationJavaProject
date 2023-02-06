package exceptiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				try {
					File file=new File("C:\\abc.txt");
					FileInputStream stream=new FileInputStream(file);
				stream.close();
				}catch(FileNotFoundException fe){
					fe.printStackTrace();
					System.out.println(fe.getStackTrace());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getStackTrace());
				}

	}

}
