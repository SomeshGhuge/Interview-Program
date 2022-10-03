package scanner_how_we_used;

//To get student name and number as required------>
import java.util.Scanner;
public class scanner_3 {
	
	public void som(String name,int number) {// ethe string use kelyas run hot naii variable is 
		 // not define mnt  & string can not be resolved into type mnt
		 // string a = number + name;
		 //System.out.println("Student name is "+name);
		System.out.println("Student name is---> "+name+"  "+"\nStudent number is---> "+number);
		 //return a;
		}
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter student name is");
		String a = scanner.nextLine();

		System.out.println("Enter student number is");
		int s = scanner.nextInt();
		
		scanner_3 somya=new scanner_3();
		somya.som(a,s);  // hi value and name kontya data type madhe store karaych
		
		
		
		
		
		
	}

}
