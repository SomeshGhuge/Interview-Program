package Interview_Programs;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your number");
		int a=scanner.nextInt();
		int addition=0;
		int digit=0;
		for(int i=0;a>0;a=a/10) {
			digit=a%10;
			addition=digit+addition;
		}
		System.out.println("digit sum is--->"+addition);
		
	}
}

