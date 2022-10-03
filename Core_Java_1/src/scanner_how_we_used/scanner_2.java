package scanner_how_we_used;
//program for addition------->
import java.util.Scanner;

public class scanner_2 {
	public int add (int a,int b) {
		int c = a+b;
		return c;
		}
	public static void main (String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first num");
		int d=scanner.nextInt();
		System.out.println("Enter second num");
		int f= scanner.nextInt();
		
		scanner_2 addd=new scanner_2();
		int g= addd.add(d,f);
		System.out.println("Your addition is----->"+g);
		
		
		
	}

}
