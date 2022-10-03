package Polymorphism;

public class Overloading___A {
	
	void m2(String String) {
		System.out.println("This is method 2A of class Overloading___A  ---> "+String);
	}
	void m2( Object object) {
		System.out.println("This is method 2B of class Overloading___A  ---> ");
	}
	public static void main(String[]args) {
		Overloading___A asdf=new Overloading___A();
	    
		asdf.m2("Ram");
		asdf.m2("Somesh");
		asdf.m2("Somya");
	}

}
