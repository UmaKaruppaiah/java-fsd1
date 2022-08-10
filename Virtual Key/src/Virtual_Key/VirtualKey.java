package Virtual_Key;
import java.io.IOException;
import java.util.Scanner;

public class VirtualKey {
	public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		AddFile cre=new AddFile();
		SearchFile  ser=new SearchFile();
		DisplayFile dis=new DisplayFile();
		DeleteFile del=new DeleteFile();
		System.out.println("enter the value for perform");
		while(true) {
			int choose= sc.nextInt();
			
			
			switch(choose) {
			case 1:
				System.out.println("File names in an ascending order");
				dis.DisplayFile();
				break;
			case 2:
				while(true) {
					System.out.println("Enter the value for the Operation");
					System.out.println("");
					int value=sc.nextInt();
					switch(value){
						case 1:
							System.out.println("Add a user specified file to the application");
							cre.AddFile();
							break;
						case 2:
							System.out.println("Delete a user specified file from the application");
							del.DeleteFile();
							break;
						case 3:
							System.out.println("search a user specified file from the application");
							ser.SearchFile();
							break;
						case 4:
							System.out.println("The current execution is closed.");
							System.exit(1);
							break; 
						default:
							System.out.println("Enter a invalid choose");
							}
					//break;
					
					}
			case 3:
				System.exit(0);
			default:
				System.out.println("Operation not Completed");
			}
		}
	}

	


}
