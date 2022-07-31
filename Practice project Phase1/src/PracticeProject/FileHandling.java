package PracticeProject;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		String a;
		try (Scanner sc = new Scanner(System.in)) {
			char[] arr = new char[97];
			try{
				File file = new File("D:\\FileHandling\\program.txt");
				if(file.createNewFile())
				{
					System.out.println("File Created.");
				}else
				{
					System.out.println("File is already exists.");
				}
				FileWriter writer = new FileWriter(file);
				writer.write("This is the 1st file to create like this. \n");
				System.out.println("Enter the statement, wants to append...");
				a=sc.nextLine();
				writer.append(a+"- \n This statement is appended");
				writer.close();
				try (FileReader in = new FileReader("D:\\FileHandling\\program.txt")) {
					in.read(arr);
				}
				System.out.println(arr);   
			}catch (IOException e) {
			    System.out.println("exception occurred " + e);
			}
		}
	}

}
