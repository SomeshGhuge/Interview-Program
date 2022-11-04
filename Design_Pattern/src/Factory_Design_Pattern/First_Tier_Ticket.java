package Factory_Design_Pattern;

public class First_Tier_Ticket implements Booking {

	@Override
	public String get_AC_Class() {
		String First_Tier="You Book Ac First Tier Ticket SUccessfully";
		
		return First_Tier;
	}

}
