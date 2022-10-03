package access_specifier_1;
//The access level of default access specifier is for whole pakage
// It cant accessed from outside the package
// No need to use default keyword like private
// When it is not specified then it will consider as the default 
//applicable to global variable,localvariable,constructor,methods,inner class,outer class

public class default_Access_Specifier_1 {
	
	int a=10;//intialisation without default keyword it is correct
	void asf() {// to provide default before void is correct but we avoid it 
		// if we provide default keyword then it shows the  error that is default is allowed onluy for interferces
		System.out.println("Hii baby");
	}
	public static void main(String[]args) {
		int c= 20;
		System.out.println("The value is 20");
		}
}
