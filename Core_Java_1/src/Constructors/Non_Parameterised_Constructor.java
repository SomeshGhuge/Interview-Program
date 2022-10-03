package Constructors;

public class Non_Parameterised_Constructor {
	// A constructor that does not accept any argument that is called non parameterised constructor
	//Non Parameterised Constructor also know as "No argument constructor".
	
	String name;// we decleared it in global area.
	public  Non_Parameterised_Constructor () {//This is a method whose name is always class name
		//Here in "()" we cant provide any argument thats why this method is called as
		// non parameterised constructor
		
		name="Shital";//string always express in double coat
		
	}
	public static void main(String[]args) {
		Non_Parameterised_Constructor somya= new Non_Parameterised_Constructor();
		String n=somya.name;
		System.out.println("Your girlfriend name is--->"+n);
	}
	}
