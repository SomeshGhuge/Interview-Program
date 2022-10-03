package This_Keyword;
// This();---> it used for constructor of current class
public class P3 {
P3(){
		
		System.out.println("You are from P3 first constructor");
	}
	
	P3( int x, int y){
		this();
		System.out.println("Your values are x="+x+" &  y="+y);
	}
	P3 ( int x, String str){
		this();
		System.out.println("Your value x = "+x+" your name is "+str);
	}

	public static void main(String[]args) {
		P3 p3 = new P3(8,9);
		P3 p4 = new P3(8,"Somesh");
	
		
		
	
		
	
		
	}

}
