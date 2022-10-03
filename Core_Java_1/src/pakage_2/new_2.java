
package pakage_2;//this is second pakage

import Inheritance2.Hierarchical_inheritance_4;
// This is we import pakage data by this statement
// By just writing import and pakage name  then options are shown and after that we select which we want
import pakage_1.new_1;

public class new_2  {//acess specifier><class><Classname>

	public static void main(String[] args) { // this is main statement
		new_1 p = new new_1(); //this is how we call the pakage 1 data/class/info
	      p.m1();//after the bject name we provide the method name which we want
		
	      Hierarchical_inheritance_4 asdf=new Hierarchical_inheritance_4();
	      asdf.getClass();
	      asdf.getStudent_name();
	}
	}
	
