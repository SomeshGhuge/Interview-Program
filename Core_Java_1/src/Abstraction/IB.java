package Abstraction;
public class IB implements IA{
	@Override
	 public void demo(){
		 System.out.println("This is demo method from IB");
	 }
	
	 
	 
@Override
public void example() {
	 System.out.println("This is example method from IB");
}
public static void main(String[]args) {
	 IB ib = new IB ();
	 ib.demo();
	 ib.example();
}
}