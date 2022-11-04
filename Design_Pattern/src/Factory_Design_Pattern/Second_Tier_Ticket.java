package Factory_Design_Pattern;

public class Second_Tier_Ticket implements Booking {

	@Override
	public String get_AC_Class() {
		String secondtier="Congratulation You Successfully Book Ac Second Tier Ticket";
		return secondtier;
	}

}
