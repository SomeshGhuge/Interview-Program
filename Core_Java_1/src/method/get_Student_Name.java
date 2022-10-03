package method;

public class get_Student_Name {//design the  method which include the string method
	String Student_Name(String name) {
		return name;
		
	}
	public static void main(String[]args) {//creating main method 
		get_Student_Name test=new get_Student_Name();//creating the object 
		String s= test.Student_Name("Somesh");//storing the info of object in new memory
		System.out.println("Student Name"+" " +s);
		
	}

}
