package Ticketbooking;
import java.util.Scanner;

public class MovieTicket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch,i,n,movch; String rowch[]=new String[12];
		int colch[]=new int[12];
		login objlogin = new login();
		String time = new String();
		String timecheck = new String();
		showsWatch objshow = new showsWatch();
		screenView objscreen = new screenView();
		ticketBooking objticket = new ticketBooking();
		//System.out.println("*********************Welcome*****************");
		while(true)
		{
			
			if((boolean) login.login())
			{
		System.out.println("Movie Ticket Booking");
		System.out.println("1.Book Movie Tickets");
		System.out.println("2.Watch The Movies/Show Timings");
		System.out.println("3.Exit After Booking");
		System.out.println("\nEnter Choice");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:	objshow.display_show_timings();
					System.out.println("Enter the Movie to Watch");
					System.out.println("Enter the option as 1,2,....");
					movch=sc.nextInt();
					do{
						System.out.println("Enter the time like (ex. 10.00)");
					System.out.println("Enter timings to Watch Shows (hh.mm)");
					time=sc.next();
					timecheck=objshow.check_time(movch,time);
					}while(timecheck.equals("false"));
					System.out.println("Enter Number of seats");
					n=sc.nextInt();
					for(i=0;i<n;i++){
						objscreen.display_seats();
						rowch[i]=sc.next().toUpperCase();
						objshow.show_empty_seats(rowch[i],movch);
						colch[i]=sc.nextInt();
						if(objshow.check_seats(rowch[i],colch[i],movch))
						{
							System.out.println("Seat is not Available");
						}
						objshow.fill_seat(rowch[i],colch[i],movch);
					}
					for(i=0;i<n;i++)
					{
								objticket.print_ticket(objshow.getmovie(movch), time, 3, objscreen.getcat(rowch[i]), rowch[i], colch[i]);
					}
					break;
				
			case 2: objshow.display_show_timings();
					break;
					
			case 3: System.out.println("Thankyou for visiting...\n");
			System.exit(0);
		}
	}
	}
	}
	
	

}
