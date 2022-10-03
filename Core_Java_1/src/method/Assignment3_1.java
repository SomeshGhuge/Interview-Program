package method;


//1. Design the separate method as String getStudentName (String name) which return student name and print it.

public class Assignment3_1 {
	
String getStudentName(String name) {
		
		return name;
		
	}
	public static void main (String[]args) {
		Assignment3_1 somya=new Assignment3_1();//create the object
		String s=somya.getStudentName("Somesh");//load the object in the s
		System.out.println("The student name is "+s);//print
		
	}


}
