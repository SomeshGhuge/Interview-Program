package Static_variable_method;

public class Info {
	//  static is used for value storing is changed by user is as it is used for next time. 
	//  but in non static value is same as initialization is same for next time also.
	//  right click + refactor + rename ------> using this we can change the name.
	//  Static block run at the time of class load.
	//  Static Block ----> Main method--->normal method..
	//  it is used for memory managment..
	//  it can be applied for variable,method,inner class&static block.
	//  it means single copy storage.
	//  The variable which is define by static keyword.
	//  it is used to refer comman property to all  objects.
	//  local variable can not be static.
	
	static {// this is the static block
		
	}
	
	static int  a=20;
	int s= 30;
	public static void main(String[]args) {
		System.out.println("Your value of static int is "+ ++a);
		System.out.println("Your value of int is "+a);
		
		
		
		
	}
	

}
