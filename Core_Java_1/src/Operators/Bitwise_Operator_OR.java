package Operators;

public class Bitwise_Operator_OR {
	// only the diff is the in bitwise operator jvm cheak both conditions but in logic their are some conditions

	public static void main(String[] args) {
		//Symbol------->" | "
		 
		
		//Epression 1      Expression 2     Result
		//   T              T                T
		//   T              F                T
		//   F              T                T
		//   F              F                F
		
		int a = 50;
		float f = 52.12f;
		  
		System.out.println(  (a<f) | (a>=f) );

	}

}
