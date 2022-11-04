package Factory_Design_Pattern;

public class Third_Tier_Ticket implements Booking {

	@Override
	public String get_AC_Class() {
       String Third_tier="Congratulation You have successfully Booked the AC Third Tier Ticket";
		return Third_tier;
	}

}
