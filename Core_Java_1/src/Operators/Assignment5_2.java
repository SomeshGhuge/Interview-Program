package Operators;

import java.util.Scanner;

//2) write a program to check whether year is leap year or not. (If else stmt)

public class Assignment5_2 {

	public static void main(String[] args) {
		
		
		System.out.println("Your year is");
		Scanner somya = new Scanner(System.in);
		int a=somya.nextInt();
	
		//Any year that is evenly divisible by 4  and remainder is 0 then this a leap year;
		// A year is  divisible by 100  then remainder is not 0;
		// A year is divisible by  400 then remainder is 0;
		
		if (a%4==0 && a%100!=0 || a%400==0) {
			System.out.println(" Year is leap year"+a);
		}else {
			System.out.println(" Year is not leap year"+a);
		}
		
		
		

	}

}
