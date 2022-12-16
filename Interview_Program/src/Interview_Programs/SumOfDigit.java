package Interview_Programs;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[]args) {
		System.out.println("Enter your number which u want to get sum of digit");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		int digit=0;
		int sum=0;
		while(number>0){
			digit=number%10; // To find out digit we use this statement
			sum=sum+digit;// To get sum we use this statement
			number=number/10;	// To change the number we use this	
		}
		System.out.println(sum);// here we get the sum of number
		
	}
}

