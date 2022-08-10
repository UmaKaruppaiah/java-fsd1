package Virtual_Key;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class DisplayFile {
	public void DisplayFile(){
		String path="D:\\FileHandling\\";
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
		
	}


}
