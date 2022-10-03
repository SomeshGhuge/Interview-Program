package access_specifier_1;
//Here we want to get info from default 1 class
public class default_Access_Specifier_2 {
	public static void main(String[]args) {
	default_Access_Specifier_1  asdf=new default_Access_Specifier_1();//We creat the object
	System.out.println( asdf.a);//we provide the printing statment
	asdf.asf();//to access data first provide the object name and then provide method name or initialisation
	
	protected_access_specifier_1 asd=new protected_access_specifier_1();
	asd.num();
	
	
	}
}
