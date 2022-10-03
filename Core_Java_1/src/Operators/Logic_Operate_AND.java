package Operators;

public class Logic_Operate_AND {
	//And operate----->  "&&"
	// Or operate------> "||"
	public static void main (String[]args) {
		int a=30;
		int b=10;
		int c= 45;
		
		//AND gate  ch operation
		
		
		// Expression 1     Expresstion 2    Result
		//    T                T              T
		//    T                F              F
		//    F                T              F
		//    F                F              F
		
		System.out.println((a<b) && (a<c));
		
	}

}
