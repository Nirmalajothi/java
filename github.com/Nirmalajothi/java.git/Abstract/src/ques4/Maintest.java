package ques4;

import java.util.Scanner;

public class Maintest {

	public static void main(String[] args) {
		
		System.out.println("Enter  the User type");
		Scanner s=new Scanner(System.in);
		String type=s.nextLine();
		if(type.equalsIgnoreCase("RegularUser")) {
			Booking r=new Booking();
			r.setBookingID("124321");
			r.setBookingDate("12/31/2020");
			r.setbCashPaid((float) 323.45);
			RegularUser regu=new RegularUser();
			System.out.println(regu.bookRoom(r));
			regu.cancelBooking("31/12/2020");
		}
		else if(type.equalsIgnoreCase("premiumUser")) {
			Booking r=new Booking();
			r.setBookingID("124321");
			r.setBookingDate("12/31/2020");
			r.setbCashPaid((float) 323.45);
			PremiumUser preu=new PremiumUser();
			System.out.println(preu.bookRoom(r));
			preu.cancelBooking("31/12/2020");
		}

	}

}
