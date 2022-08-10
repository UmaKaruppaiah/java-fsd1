package Virtual_Key;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile {
	public void DeleteFile(){
		String path="D:\\FileHandling\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		f.delete();
		System.out.println("file gets deleted");
		
	}

}
