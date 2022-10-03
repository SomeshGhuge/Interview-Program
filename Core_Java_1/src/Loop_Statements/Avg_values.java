package Loop_Statements;
import java.util.Scanner;

public class Avg_values {
	//print avg value with your own number
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in) ;
			System.out.println("Enter your value A");
			int A=scanner.nextInt();
			System.out.println("Enter your value B");
			int B=scanner.nextInt();
			System.out.println("Enter your value C");
			int C=scanner.nextInt();
			System.out.println("Enter your value D");
			int D=scanner.nextInt();
			System.out.println("Enter your value E");
			int E=scanner.nextInt();
			
			int F= (A+B+C+D+E);
			float  G= (F/5);
			System.out.println("Your avg is--->"+G);
			
			
		
		
	}
	

}
