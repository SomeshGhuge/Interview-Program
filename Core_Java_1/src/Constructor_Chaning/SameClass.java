package Constructor_Chaning;

public class SameClass {
	
	public SameClass() {
		System.out.println("This is constructor from sameclass1");
	}
	public SameClass(int x) {
		this();
		int y= x*x;
		System.out.println("This is constructor 2---> "+y);
	}
	public SameClass(String name) {
		this(5);
		System.out.println("This from last");
		
	}
	public static void main(String[]args) {
		SameClass sameclass= new SameClass("somya");
		
	}

}
