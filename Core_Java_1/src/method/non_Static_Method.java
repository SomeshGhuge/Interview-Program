package method;

public class non_Static_Method {//we design the non static method
	
	
	 void test() {
		System.out.println("The Non Static Method is");// printing statement
	}
	public static void main(String[]args) {//only one way to call non static method is to call object
		non_Static_Method somya=new non_Static_Method();//create a new object 
		somya.test();//using object we call the test
//<objevct name>.<method name>();..................syntax of calling object
		
		
	}

}
