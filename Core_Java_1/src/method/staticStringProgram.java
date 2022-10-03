package method;

public class staticStringProgram {

	// here we run the static string program with using classname way;
	static String num (String a,String c,String b) {
		String n=a+c+b;
		
		return n ;
	}
	
	public static void main(String[]args) {
		//_1 f=new _1();
		//String g=f.num("son","ghu");
		//System.out.println("the value is the "+g);
	//	staticStringProgram.num("son", "ram");
		String g=staticStringProgram.num("son","  ", "ram");
		System.out.println("The name is "+g);
		
		
		
	}

}
