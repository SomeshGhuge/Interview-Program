package SingletonePattern;

public class TestSingltonn_why {

public static void main(String[] args) throws CloneNotSupportedException {
	 Singleton_From_web s1 =  Singleton_From_web.getSingletonObject();
	 Singleton_From_web s2 =  Singleton_From_web.getSingletonObject();
	 
	 System.out.println(s1.hashCode());
	 System.out.println(s2.hashCode());
	 
  }
}
