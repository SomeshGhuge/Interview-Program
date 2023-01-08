package Interview_Programs;

import java.util.Scanner;

public class String_Concat {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Your First String word");
		String s1=scanner.next();

		System.out.println("Enter Your Second String word");
		String s2=scanner.next();
		
		String str=s1.concat(s2);
		System.out.println(str);
	
	}

}
