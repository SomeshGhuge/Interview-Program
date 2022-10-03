package method;




//access specifier
//return type int=integer only
//return type string= names,alphabates etc..
//return typr void = no return type.
//diff between the static method and non static method is only static word is used

public class static_Void_Method {// this is classs name this is the static method and void return

 static void test() {//public is access specifier //static is keyword declareing static//void contains no return//test is method name
	System.out.println("This is a static method");
}
public static void main(String[]args) {//this is the main method in wich programm is run
	static_Void_Method.test();//Calling the static method by using class name (1)
	
	static_Void_Method somya=new static_Void_Method();// here we create the object by using object name is somya
	somya.test();//calling the static method by using object(2)
	//here bulb is created for object method not used for call the static method
	
	test();//we direct call the static method (3)
	
	
}


}