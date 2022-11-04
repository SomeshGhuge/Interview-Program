package Factory_Design_Pattern;

public class Booking_Factory {
	public static Booking Create_Booking(String input) {
		
	  if(input.equalsIgnoreCase("First")){
		  return new First_Tier_Ticket();
	  }else if(input.equalsIgnoreCase("Second")) {
		  return new Second_Tier_Ticket();
	  }else if(input.equalsIgnoreCase("Third")){
		return new Third_Tier_Ticket();
	  }
	throw new IllegalArgumentException("This is Invalid Input");
	}

}
