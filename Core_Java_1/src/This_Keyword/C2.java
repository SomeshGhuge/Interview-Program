package This_Keyword;

public class C2 extends P2{
	// if we provide here Override then program will not work it says class must implements
	
	void m2() {
		System.out.println("This is from C2 class m2 method");
	}
	// if we comment void m2 method from C2 class then m2 method print from P1 class.
	void m3() {
		this.m2();
		System.out.println("This is m3 method from c2 class");
	}

}
