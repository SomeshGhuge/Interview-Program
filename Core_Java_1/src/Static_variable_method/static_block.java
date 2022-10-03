package Static_variable_method;
import java.util.Scanner;
public class static_block {
	static {
		System.out.println("What is your  girlfriend name");
		Scanner scanner= new Scanner(System.in);
		String a= scanner.next();
     }
	public static void main(String[]args) {
		System.out.println("This is your  Girlfriend name");
	}

}
