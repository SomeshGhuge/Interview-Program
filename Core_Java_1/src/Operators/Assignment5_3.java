package Operators;

//3)write a program to find out maximum number among three number
//           (if else if ladder statement)

public class Assignment5_3 {
	public static void main(String[]args) {
		int a = 922;
		int b=65;
		int c =86;
		
		// && used for aani
		// || used for kinvha
		
		if(a>b && a>c) {
			System.out.println("The maximum number is "+a);
		}else if(b>a && b>c) {
			System.out.println("The maximum number is "+b);
		}else {
			System.out.println("The maximum number is "+c);
			
		}
		
	}

}
