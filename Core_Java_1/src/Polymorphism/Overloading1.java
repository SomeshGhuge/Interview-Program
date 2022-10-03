package Polymorphism;

public class Overloading1 {
	void m1 (float a) {
	    System.out.println("This is method 2 of class overloading 1-----> "+(a));	
		}
	void m1 (double a) {
	    System.out.println("This is method 2 of class overloading 1-----> "+(a));	
		}
	void m1 (int a, int b) {
	    System.out.println("This is method 2 of class overloading 1-----> "+(a+b));	
		}
	void m1(float a, int b, int c) {
		System.out.println("This is method 2 of class overloading 1-----> "+(a+b+c));
	} 
	public static void m1( double a, double b) {
		System.out.println("This is method 3 of class overloading 1------> "+(a+b));
	}
	String m1( String a) {
		System.out.println("This is method 4 of class overloading 1------> "+a);
		return a;
	}
	

}
