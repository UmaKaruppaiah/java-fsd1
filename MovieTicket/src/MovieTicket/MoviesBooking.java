package MovieTicket;

import java.util.Scanner;

public class MoviesBooking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name: ");
		String user=input.nextLine();
		System.out.println("Enter the password: ");
		
		int status =1;
		Booking movlist[]=null;
		do {
			System.out.println("Welcome to cinema hall");
			System.out.println("1. Add movie details");
			System.out.println("2. Search and book");
			System.out.println("3. view all");
			System.out.println("enter your choice: ");
			int ch=sc.nextInt();
			switch(ch) {
			//int ch=sc.nextInt();
			case 1:
				System.out.println("Enter number of movies: ");
				int no=sc.nextInt();
				movlist= new Booking[no];
				for(int i=0;i<movlist.length;i++) {
					int j=i;
					System.out.println("Enter movie "+ ++j +" Details");
					movlist[i]=new Booking();
				}
				System.out.println("Data saved.");
				break;
			case 2:
				boolean flag= true;
				sc.nextLine();
				System.out.println("Enter the movie name: ");
				String name =sc.nextLine();
				for(int i=0; i<movlist.length; i++) {
					if(movlist[i].getName().equals(name)) {
						movlist[i].viewAlldetails();
						flag=true;
						System.out.println("would you like to book a ticket: ");
						System.out.println("enter 1 to book & 2 to exist: ");
						int c=sc.nextInt();
						if(i==c) {
							System.out.println("Enter the number of the ticket: ");
							int ticket=sc.nextInt();
							int tc=movlist[i].getCost()*ticket;
							System.out.println("the bill upto: "+tc);
							
						}else
							break;
					
				}else
					flag=false;
			}
				if(flag==false)
					System.err.println("Not found");
				break;
			case 3:
				for(int i=0;i<movlist.length;i++) {
					movlist[i].viewAlldetails();
				}
				default :
					System.out.println("Wrong enter value");
		}
			System.out.println("do you want to continue(1.yes or 2.no): ");
			status =sc.nextInt();
		}while(status==1);
		System.out.println("Succesfully run");
	}
	

}

