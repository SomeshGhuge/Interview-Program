package Inheritance2;

public class Multipal_Inheritance_3 extends  Multipal_Inheritance_2 {
	public static void main(String[]args) {
		Multipal_Inheritance_2 asdf=new  Multipal_Inheritance_3();// thus is dymond dispatch
		asdf.m1();// it shows compile time error bcauz we use same method name 
		//compiler will confuse which value he will be access.
       // no output
// here we see output bcauze we use @Override at a time of practise and it store by jvm 
		
		
		
	}

}
//                              Somesh                    Ganesh


 
//                                      Velocity                             