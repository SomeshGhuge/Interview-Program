package Factory_Design_Pattern;

import java.util.Scanner;

public class TestMain_Factory_Design {
	public static void main(String[] args) {
		try {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("<---Enter Which  Ticket You Want-->");
			System.out.println("You have option---> First,Second,Third");
			String Booking=scanner.next();
			Booking b=Booking_Factory.Create_Booking(Booking);
			System.out.println(b.get_AC_Class());
		}catch(Exception e) {
			e.getMessage();
			e.getStackTrace();
        }
	}

}
