package Constructors;

public class Parameterised_Constructor {
	int  id;//here we decleared the variable
	String name;
	String city;
	public Parameterised_Constructor(int userid,String username,String usercity) {
		// This is the syntax of  parameterised constructor
		id= userid;//here we initialise the variable
		name=username;
		city=usercity;
		System.out.println("user name is -->"+name);//printing statement
		System.out.println("user id is --->"+id+"\nuser city--->"+city);
	}
	public static void main(String []args) {// main method
		Parameterised_Constructor asdf= new  Parameterised_Constructor(112,"Somya","Latur");
		//here we assign a value in object 
		
	}

}
