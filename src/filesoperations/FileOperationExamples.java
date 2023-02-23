package filesoperations;

import java.io.*;
import java.util.Scanner;
public class FileOperationExamples {

	public static void main(String[] args) {
		writingStringIntoFile();

	}
	public static void writingStringIntoFile() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			FileWriter fw=new FileWriter("c:/files/demo.txt"); // checked exception
			System.out.println("Enter name ->");
			String str=sc.next();
			fw.write(str);
			fw.close();
			System.out.println("Writing completed successfully.....");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public static void readingStringFromFile() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			FileReader fr=new FileReader("c:/files/demo.txt"); // checked exception
			int position;
			while((position=fr.read())!=-1) // -1 represent here end of file
			{
				System.out.print((char)position);
			}
			fr.close();
			System.out.println("Writing completed successfully.....");
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}
}