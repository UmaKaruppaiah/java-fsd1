package PracticeProject;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
	public class File_Handling  {
	public static void main(String[] args) throws IOException{
		
		FileWriter fo= new FileWriter("input",true);
		if(fo!=null) {
			System.out.println("File is Created & open in Write mode");
		}
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the input of the file");
			String fileinput=sc.nextLine();
			byte b[]=fileinput.getBytes();
			fo.write(fileinput);

			System.out.println("write operation completed");
			
			
			try (FileReader fi = new FileReader("input")) {
				if(fi!=null) {
					System.out.println("File Exist");
				}
				int i=0;
				//FileInputStream fi=;
				while((i=fi.read())!=-1){
					System.out.print((char)i);
				}
			}
			//Append append=new Append("input");
			String append1=sc.next();
			System.out.println(fileinput + append1);
			//String c=sc.nextString();
		}
		
		
		//Object ;
		//appendUsingFileReader(append);
	//	a.append( "input"+ "c");
			
		fo.close();
		}

	/*private static void appendUsingFileReader(String append) {
		// TODO Auto-generated method stub
		String append=sc.nextLine();
		writerFile.append(input+"- This statement is appended");*/
		
		}
	

