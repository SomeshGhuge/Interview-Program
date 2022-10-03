package access_specifier_1;
//This is the first access specifier
//only used for within the class only
//cant access from outside class or outside package as scope is very limited
//it can apply to globle variable,method,constructor and inner class only
public class private_Access_specifire{  
	private int a=10;
	private void somya() {
		System.out.println("Your name is somesh");
			}
		   		 public static void main(String args[]){  
		   			private_Access_specifire Private_Access_specifire=new private_Access_specifire ();  
			   System.out.println(Private_Access_specifire.a);
			   Private_Access_specifire.somya();
			   }  
   }  

