package Interview_Programs;

import java.util.Scanner;

public class Even_Odd_Numbers {
	
	public static void main(String[]args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=scanner.nextInt();
		if(a%2==0) {
			System.out.println("your number is even");
		}else {
			System.out.println("Your number is not even");
		}
		
	}

}
