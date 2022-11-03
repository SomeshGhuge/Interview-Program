package SingletonePattern;

public class Singleton{   

//Step-1  Create class singleton and static member of class.
	private static Singleton singletonobject; 

//	Step- 2   Make constructor as private	
	private Singleton() {
		
	}

//	Step- 3 Create the method for checking the references and 
//	use synchronized block instead of method.	
	public static Singleton getSingletonObject() {
		synchronized (Singleton.class) {
	// here diff thread come and cheak whether it is null or not 
	// if it is null then only one thread goes in to it and occuepy
	// space then no thread is allowed in it 
	// so we get only one instance known as singleton 
			if (singletonobject == null) {
					singletonobject = new Singleton();
				} else {
					return singletonobject;
			}
				return singletonobject;   
		}
	}
	
/* Step-4   ---> We can still able to create the copy of object by 
	cloning it using object clone method. Override the object clone 
	method to prevent cloning as below.
	
	(If singleton class will implements clonable interface----->
	class Singleton implements Clonable and override object clone
	 method into singleton class)

*/

	@Override
	protected Object clone() throws CloneNotSupportedException{
		return new CloneNotSupportedException();
	}


	
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton obj1 = Singleton.getSingletonObject();
	//	Singleton obj2 = Singleton.getSingletonObject();
		
		
		Singleton obj2 = (Singleton) obj1.clone();
// At this clone line 51 we get exception that shows another clone
// method is not allow to run
		
		System.out.println("object 1>>"+obj1.hashCode());
		System.out.println("object 2>>"+obj2.hashCode());
	}


}
	