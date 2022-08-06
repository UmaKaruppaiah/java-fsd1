package Ticketbooking;

import java.util.Scanner;

public class login {
		public static boolean login() {
			String username, password;
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter username:");
	        username = in.nextLine();
	        System.out.print("Enter password:");
	        password = in.nextLine();
	        if(username.equals("abcd") && password.equals("1x2y"))
	        {
	            System.out.println("Login Successful\n");
	            return true;
	        }
	        else
	        {
	            System.out.println("Login Failed\n");
	            return false;
	        }
		}

}
