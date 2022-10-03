package scanner_how_we_used;// this is a package name

// program for table----->

import java.util.Scanner;//this is used for call the scanner function

public class scanner {//this is class name
	public static void multiplication(int num) {//this is the method name
		for(int i=1 ; i<=10; i++) { //this is for loop for condition which is given
			int c= num*i;
			System.out.println(num+"*"+i+"="+c);//printing statement
		}}
			
	 static public void main(String[]args) {//main method
		 System.out.println("Enter your number for multiplication");//for get input from user
		 Scanner somya =new Scanner (System.in);//this is compulsary to get the input
         int x = somya.nextInt();//in int x we load the input value
		 System.out.println("value>>>"+x);//this is for user observation which value was type
		 multiplication(x);//put given value in addition method
		  }
}
