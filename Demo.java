package busres;

import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
	
		ArrayList<Vechile1> buses = new ArrayList<Vechile1>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Vechile1(1,true,2));
		buses.add(new Vechile1(2,false,50));
		buses.add(new Vechile1(3,true,48));
		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		for(Vechile1 b:buses) {
			b.displayBusInfo();
		}
		
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
			}
		}
	}

}