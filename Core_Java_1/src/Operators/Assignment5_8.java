package Operators;

//8. Write a program to swap the two numbers.

public class Assignment5_8 {
	public static void main(String[]args) {
		int a=5;
		int b=6;
		
		System.out.println("Before swapping\n"+"a is---> "+a+"\nb is--->"+b);
		
		int somya;//we need to initialise the new space
		somya=a;//this is swapping values
		a=b;
		b=somya;
		 
		System.out.println("After swapping\n"+"a is--->"+a+"\nb is--->"+b);
		
	}

}
