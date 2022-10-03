package Return_Method;
// This is example 2 
public class Example_2 {// This is class name
	int id = 85;// here we decleare and initialize the values
	String name= "Somesh";
	String city= "Latur";
	public Example_2 addemployee() {// here we creat the return type with classname only
		Example_2 a= new Example_2();// here we creat object of classname to get details  in class
		System.out.println("The info is "+a); //this is how we get output
		return a;// here we return values in object name
	}
	public static void main(String []args) {// This is main method 
		Example_2 e= new Example_2();// creat the object of class name but diff object name 
		// it is diff storage even same class has diff object name.
		e.addemployee();// we call the method
	}
// here the output is a hashcode to get right ans we must provide the Override to string method 
	// which is class of object class
}
