package Return_Method;

public class Example_1{// THis is class name
	
	public Example_1 m1() {//Here return name must be same as class name
		Example_1 asdf= new Example_1();// here creat the object of class name 
		return asdf;// always remainber that return is in object name only
	}
	

//Note:- if you have Department class as return type for method then
//       it must return the department class object not employee class objects.
	
//	            public ASDF A() {// we cant use another return name instead class name
//		        ASDF empl=new ASDF();// it shows compile time error
//	         	return empl;// always return in object name 
//	     }
//
//       }
}