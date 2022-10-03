package Return_Method;
import java.util.Scanner;
public class A2 {
	public static A1 getdetails() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=scanner.next();
		System.out.println("Enter the id");
		int id=scanner.nextInt();
		System.out.println("Enter the city");
		String city=scanner.next();
        
		return new A1( id,name,city);

	}
	
	public static void main(String[]args) {
		A1 a=getdetails();
		System.out.println("Your name is "+a.name);
		System.out.println("Your city is "+a.city);
		System.out.println("Your id is "+a.id);
//		A2 a=new A2();
//		a.getdetails();
//  
// By creatig object we can get ans although static is not in method

	}

}
