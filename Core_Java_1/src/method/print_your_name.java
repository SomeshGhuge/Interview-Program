package method;
// used to avoid rewriting the same code again and again
//it is nothing but collection of statements ,variables ,conditions etc to perform tasks ...
//  it is divided into two types first is static method and second method is non static method



public class print_your_name {//by using static method
	static String som(String name,String name2,String name3 ) {
		String s=name+" "+name2+" "+name3;
		return s;
		
	}
	
	public static void main (String[]args) {
		
		//String g=print_your_name.som("somesh", "dnyanoba", "ghuge");
		String g= som("Somesh","Dnyanoba","Ghuge");
		System.out.println("Your name is" +"\n"+g);
		
		
	}

}
