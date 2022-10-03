package Static_variable_method;

public class Sequence_of_static_execution {

	static {
		System.out.println("This is 1st");
	}
	static {
		System.out.println("This is 4th");
	}
	static {
	}
	static {
		System.out.println("This is 2nd");
	}
	static {
		System.out.println("This is 3rd");
	}
	public static void main(String[]args) {
		
			System.out.println("This is 6th main method");
		}
	
}
