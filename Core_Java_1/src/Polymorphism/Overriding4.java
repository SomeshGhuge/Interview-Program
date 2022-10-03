package Polymorphism;

public class Overriding4 extends Overriding3  {
	
	void m2(){
		System.out.println("This is method m4 from class Overriding4 ");
		
	}
	public static void main(String []args) {
		Overriding4 m3= new Overriding4();
		m3.m4();
	}

}
