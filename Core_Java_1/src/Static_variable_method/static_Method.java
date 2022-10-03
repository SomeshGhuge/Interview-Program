//  It belongs to class rather than object of class.
//  It loads into memory before object creation.
//  It can access only static data member only.
//  Main method is static method.


package Static_variable_method;

public class static_Method {
	 static String num (String n,String c ,String a) {
		 String somya =n +c+ a ;
		 
		 System.out.println("Your name is "+somya);
		 return somya;
		 }
	 public static void main(String[]args) {
		
		  static_Method.num("Somesh"," ","Ghuge");//by calling class name
		 num("Somesh"," ","Ghuge");//direct method
		 
		 
		 
	 }

}
