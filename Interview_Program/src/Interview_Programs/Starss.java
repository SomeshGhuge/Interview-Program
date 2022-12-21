package Interview_Programs;

import java.util.Scanner;

public class Starss {
	public static void main(String args[]) {
	
	
	  System.out.println("<-----Right Triangle----->");
	  
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
		
		
		
		
	System.out.println("<----- Trangular star from starting------->");
	  
	 	
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
		}
		
		
		
System.out.println("\n\n<-------- Rever Trangle from left side--------->");
	
		int p,q,r=9;
		//Outer loop work for line by line means for rows
		for(p=0;p<r;p++) {
			// Inner loop work for space
			for(q=r-p;q>1;q--) {
				System.out.print(" ");
			}
			// Inner loop for columns
			for(q=0;q<p;q++) {
				System.out.print("*");
				
			}
	
			System.out.println();
		}
		
		
		
		  
		
		 System.out.println("\n\n<------Star Reverser Trangle----->");
		
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
			
		}	      
		System.out.println("\n\n<-----Star trangle--->");
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number of rows how many you want");
		int rows=s.nextInt();
		System.out.println("<------ The star pattern is ---->");
		for(int m=1; m<=rows;m++) {
			// These is for spaces
			for(int n=rows;n>m;n--) {
				System.out.print(" ");
			}
			// These is for Star pattern
			for(int z=1; z<=(m*2)-1;z++) {
				System.out.print("*");
			}
			System.out.println();
		}    
		
	}
}
