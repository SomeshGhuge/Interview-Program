package Return_Method;
// THis is Example 3 ---> Here we provide Override String to String method to get right ans
public class Example_3 {
	int a=85;
	String name="Somesh";
	String city="Latur";
	int rollno= 15;
	public Example_3 m3() {
		Example_3 q= new Example_3();
		System.out.println("The details are \n"+q);
		return q;
	}
	@Override
	public String toString() {// used to get the values which decleare in class
		// and which is in return only.
		
		return "Your name is "+name+"\nYou are from "+city
				+"\nYour roll no is "+rollno+"\nYour value is "+a;
	}
	public static void main(String[]args) {
		Example_3 w= new Example_3();
		w.m3();
	}
	

}
