package SingletonePatternSerializable;
import java.io.Serializable;
public class Singleton implements Cloneable,Serializable {
	private static Singleton singletonobject;
	private Singleton() {	}
	public static Singleton getSingletonObject() {
		synchronized (Singleton.class) {
			if (singletonobject == null) {
				singletonobject = new Singleton();
			} else {
				return singletonobject;
			}
			return singletonobject;       
			}
		}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();                            
		}

// After writing this method we get the Single object aotherwise 
//we get two hashcode
protected Object readResolve() {
	return singletonobject;
}

}
