package Polymorphism;

	 class Overriding_Example_HDFC extends Overriding_Example_Axis{
		 @Override
		 void getSimpleIntereset(float simpleRate){

				System.out.println("This is from HDFC");
			}
	
		 public static void main(String[]args) {
			 Overriding_Example_HDFC somya= new Overriding_Example_HDFC();
			 somya.getSimpleIntereset(8);
			 
		 }

}
