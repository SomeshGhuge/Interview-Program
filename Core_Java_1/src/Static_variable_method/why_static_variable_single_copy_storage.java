package Static_variable_method;

public class why_static_variable_single_copy_storage {
	int a = 50;
	static int s=60;
	public static void main(String[]args) {
		why_static_variable_single_copy_storage asdf=new why_static_variable_single_copy_storage();
		System.out.println("Non static value is"+asdf.a++);
		System.out.println("Static value is "+asdf.s++);
		
		why_static_variable_single_copy_storage asdf1=new why_static_variable_single_copy_storage();
		System.out.println("Non static value is "+asdf1.a++);
		System.out.println("Static value is "+asdf1.s++);
		
		why_static_variable_single_copy_storage asdf2=new why_static_variable_single_copy_storage();
		System.out.println("Non static value is "+asdf2.a++);
		System.out.println("Static value is "+asdf2.s++);
		
		
		// after getting value we consider that static value is change with object 
		//but non static value does not change
		
		
//We cannot call
//non-static member from static member because static variables stored into memory before object creation 
//and non-static variables stored into memory after object creation.
		
		
		
	}

}
