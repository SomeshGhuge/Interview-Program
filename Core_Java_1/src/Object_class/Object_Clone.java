package Object_class;
// 4.	protected Object clone() throws CloneNotSupportedException-
//   it creats and return exact copy of this object.
public class Object_Clone implements Cloneable {
	int x=1;

	public static void main(String[]args)throws CloneNotSupportedException {
		Object_Clone b1= new Object_Clone();
		b1.x=50;
		System.out.println("First object data is>>>>  "+b1.x);
		Object b2=b1.clone();
		System.out.println("Second object data is>>>> "+b2);

	}

}
//
//folllowing are some classes of object classes:-
//5) public final void notify()
//6) public final void notifyAll()
//7) public final void wait (long timeout )throws Interrupted Exeception()
//8) protected void finalize()throws Throwable
