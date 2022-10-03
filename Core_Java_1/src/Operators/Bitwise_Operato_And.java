package Operators;

public class Bitwise_Operato_And {
	public static void main(String[]args) {
		//AND----->"&"
		//OR-----> "|" ...........Inclusive Or
		//Exclusive/XOR     or------   "^"
		int a=10;
		int b=10;
		int c= 45;
		
		//AND gate  ch operation
		
		
		// Expression 1     Expresstion 2    Result
		//    T                T              T
		//    T                F              F
		//    F                T              F
		//    F                F              F
		
		System.out.println((a<b) & (a<c));
		
	
		
	}

}
