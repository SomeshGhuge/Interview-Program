package Constructors;

public class Default_Constructor {
	//Default constructor (No- argument constructor)
	//	When you don’t write any constructor in the class 
	// then default constructor will be added by Compiler automatically at the compile time.
	//	When you write any constructor in the class 
	// then default constructor will not added by Compiler.
	//	A default constructor that does not accept any arguments.
	
	String name;
	public static void main(String[]args) {
		Default_Constructor new1=new Default_Constructor();
		String P=new1.name;
		System.out.println("Name is--->"+ P);
		
		
	}
	// here  we get output as null because we cant provide any name we just decleared the variable 
	//This is default constructor because jvm automatically declared constructor w
	// when constructor is not given by the user.


}
