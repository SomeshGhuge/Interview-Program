package Operators;

public class Logic_Operator_OR {
	// Symbol-------->"||"
	
	public static void main(String[]args) {
		int s=10;
		int d=20;
		int f=30;
		int g=40;
		//OR gate values
		
		//expression 1     expression 2    result
		//   T              T               T
		//   T              F               T
		//   F              T               T
		//  F              F                F
		
		System.out.println((s<=d) || (f>g) || (d<g) || (s>f));
		// 1st is true
		// 2nd is true
		// 3rd is true
		//4th is true
	}

	
	// Assignment operator  kashyachya(+-/*<>.....etc) hi pudhe = lawlyas tyala mntat
}
