package Polymorphism;

public class Overriding_ThirdTier extends Overriding_SecondTier {
	
	void getSeat(int seat){
		 
		System.out.println("This is from 3rd Tier"+seat);
		
	}
	

	public static void main(String []args) {
		Overriding_ThirdTier A=new Overriding_ThirdTier();
		A.getSeatAvailability(1);
	    A.getSeatAvailability(0);
	    A.getSeat(0);
	}

}
