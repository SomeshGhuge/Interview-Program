package This_Keyword;

public class C1 extends P1 {
	int x=25;
	public void m1() {
		int x=30;
		//Scenario 1
		C1 c1 =new C1();
		System.out.println("Your value is "+c1.x);
		
		// Scenario 2 
		System.out.println("Your value is by using this keyword "+this.x);
		
		// Scenario 3
		System.out.println("Your value is by using super keyword "+super.x);
		
		
	}
	

}
