package SingletonePattern;

public class Singleton_From_web {
private static Singleton_From_web singletonobject;

// by using this egger instantiation or egger object creation.
// we use this method only when request to use egger way
// it uses only when there is a one thread only.
// private static Singleton singletonobject = new Singleton();

private  Singleton_From_web(){     

  }
/*
if we use the following method as synchronised then performance is
reduces.so we cant use it .we use synchronized block.

public static synchronized Singleton getSingletonObject(){}
 */
public static Singleton_From_web getSingletonObject() {
	if(singletonobject == null) {
	synchronized (Singleton_From_web.class) {
		if (singletonobject == null) {
				singletonobject = new Singleton_From_web();
			} else {
				return singletonobject;
			}
		}
	}
	return singletonobject;
	}
}
