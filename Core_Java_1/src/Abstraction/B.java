package Abstraction;

public class B extends A{
	@Override    //----------> its just comment only for understand to this latest method is print when call
	void example() {
		System.out.println("This is example from class B");
	}
	@Override
	void demo() {
		System.out.println("This is demo from class B");
	} 
	public static void main(String []args) {
		B b = new B();
		b.demo();
		b.example();
	}

}
