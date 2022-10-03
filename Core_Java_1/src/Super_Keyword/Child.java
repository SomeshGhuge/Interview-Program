package Super_Keyword;

public class Child extends Parent{
	int x = 25;
	public void test() {
		int x = 35;
		
//		//Scenario 1----->
//		Parent p = new Parent();
//		System.out.println("Your value is from scenario 1 "+p.x);
//  By using this we can get output but every time call object or create object is not worthy.
		
		// Scenario 2----->
		System.out.println("Immediate of super class of from scenario 2 "+super.x);
	}

}
