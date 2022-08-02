package Virtualkey;
import java.io.IOException;
import java.util.Scanner;
public class Virtual_Key {
	public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		CreateFile cre=new CreateFile();
		SearchFile  ser=new SearchFile();
		DisplayFile dis=new DisplayFile();
		DeleteFile del=new DeleteFile();
		System.out.println("enter the value for perform");
		//int choose= sc.nextInt();
		while(true) {
			int choose= sc.nextInt();
			
			
			switch(choose) {
			case 1:
				dis.DisplayFile();
				break;
			case 2:
				while(true) {
					System.out.println("Enter the value for the Operation");
					System.out.println("");
					int value=sc.nextInt();
					switch(value){
						case 1:
							cre.CreateFile();
							break;
						case 2:
							del.DeleteFile();
							break;
						case 3:
							ser.SearchFile();
							break;
						case 4:
							System.exit(0);
						default:
							System.out.println("Enter a invalid choose");
							}
					
					}
			case 3:
				System.out.println("Operation Colmpleted");
			default:
				System.out.println("Operation not Completed");
			}
		}
	}


}
