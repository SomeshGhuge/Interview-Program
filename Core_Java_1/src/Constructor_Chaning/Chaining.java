package Constructor_Chaning;

public class Chaining {
	Chaining() {
		this(5);
		System.out.println("This is Default constructor");
		}
		Chaining(int x) { //this is parameterized constructor with int
		this("Java");
		System.out.println(x);
		}
		Chaining(String str) { //this is parameterized constructor with string
		System.out.println(str);
		}
		public static void main(String args[]) {
		Chaining chaining=new Chaining(); //calling default constructor here
		}


}
