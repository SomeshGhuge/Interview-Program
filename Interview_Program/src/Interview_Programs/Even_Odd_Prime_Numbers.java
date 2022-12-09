package Interview_Programs;

import java.util.Scanner;

public class Even_Odd_Prime_Numbers {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num=scanner.nextInt();
		
		if(num%2==0) {
			System.out.println("Your Number is even number");
		}else {
			System.out.println("Your Number is not even number");
		}
		
	}

}
