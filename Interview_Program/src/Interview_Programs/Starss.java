package Interview_Programs;

import java.util.Scanner;

public class Starss {
	public static void main(String args[]) {
	// For print ***** like 5 lines
	
	
	 /*	for(int i=1;i<=5;i++) {
	
			for(int j=1;j<=5;j++) {
				System.out.println("*");
			}
			System.out.println();
		} */
	/*
	  // Right Triangle
	  
	  	int value =1;
		for (int i=1;i<=5;i++) {
			int a=value*i;
			if(a==1) {
				System.out.println("*");
			}
			if(a==2) {
				System.out.println("**");
			}
			if(a==3) {
				System.out.println("***");
			}
			if(a==4) {
				System.out.println("****");
			}
			if(a==5) {
				System.out.println("*****");
			}
			
		}
		for (int i=4;i>=1;i--) {
			int a=value*i;
			if(a==1) {
				System.out.println("*");
			}
			if(a==2) {
				System.out.println("**");
			}
			if(a==3) {
				System.out.println("***");
			}
			if(a==4) {
				System.out.println("****");
			}
			if(a==5) {
				System.out.println("*****");
			}
	}     
		*/
		
		
		
	/*  Trangular star from starting
	  
	 	
		for (int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		} */
		
		
		

		/*
		int i,j,row=9;
		//Outer loop work for line by line means for rows
		for(i=0;i<row;i++) {
			// Inner loop work for space
			for(j=row-i;j>1;j--) {
				System.out.print(" ");
			}
			// Inner loop for columns
			for(j=0;j<i;j++) {
				System.out.print("*");
				
			}
	
			System.out.println();
		}
		*/
		
		
		/*   
		 Dymond Pattern
		 
		
		int row,i,j,space=1;
		System.out.println("Enter the number of rows you want to print:--");
		Scanner scanner = new Scanner(System.in);
		row =scanner.nextInt();
		
		space=row-1;
		
		for(j=1;j<=row;j++) {
			for(i=1;i<=space;i++) {
				System.out.println(" ");
			}
			space--;
			for(i=1;i<=2*j-1;i++) {
				System.out.println("*");
				System.out.println("");
			}
			space=1;
			for(j=1;j<=row-1;j++) {
				for(i=1;i<=space;i++) {
					System.out.print(" ");
				}
				space++;
				for(i=1;i<=2*(row-j)-1;i++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		}	       */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number of rows how many you want");
		int rows=scanner.nextInt();
		System.out.println("<------ The star pattern is ---->");
		for(int m=1; m<=rows;m++) {
			// These is for spaces
			for(int n=rows;n>m;n--) {
				System.out.print(" ");
			}
			// These is for Star pattern
			for(int p=1; p<=(m*2)-1;p++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
