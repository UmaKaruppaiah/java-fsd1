package MovieTicket;

import javax.security.auth.callback.PasswordCallback;

public class Login {
	public static void USerLogin(String[] args) {

	    String Username;
	    String Password;

	    PasswordCallback[] = {"123,456,789,0123,44567,8888,90090,36732"};
	    Username[]= {"wisdom,rani,ram, danush,dharani,ramya,kumar,lily"};

	    Scanner input1 = new Scanner(System.in);
	    System.out.println("Enter Username : ");
	    String username = input1.next();

	    Scanner input2 = new Scanner(System.in);
	    System.out.println("Enter Password : ");
	    String password = input2.next();

	    if (username.equals(Username) && password.equals(Password)) {

	        System.out.println("Access Granted! Welcome!");
	    }

	    else if (username.equals(Username)) {
	        System.out.println("Invalid Password!");
	    } else if (password.equals(Password)) {
	        System.out.println("Invalid Username!");
	    } else {
	        System.out.println("Invalid Username & Password!");
	    }

}
