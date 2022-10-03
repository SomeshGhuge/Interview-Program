package Static_variable_method;

public class how_we_access_the_static_variable{
	static int a= 20;
	static void somya(){
		System.out.println("Your name is  Somesh Dnyanoba Ghuge");
	}
	public static void main(String[]args) {
		
		how_we_access_the_static_variable asdf = new how_we_access_the_static_variable();
		 // This is for a variable
		// 1) By using class name
		     System.out.println("Your value is "+how_we_access_the_static_variable.a);
		    
		// 2) By using directly name
		     System.out.println("Your value is "+a);
		     
	    // 3) By using object
		     System.out.println("Your value is "+ asdf.a);
		     
		     
		     
		     // This is for static method
		     
		     
		     asdf.somya();// by using object
				how_we_access_the_static_variable.somya();// By using class name
				somya();//directly name
		
		
		
	}

}
