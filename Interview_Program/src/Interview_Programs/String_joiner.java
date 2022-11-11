package Interview_Programs;

import java.util.StringJoiner;

/*
  Using Java 1.8 Features
 Output:-->
           A,B C,
           P:Q
           merge this to strings  (A,B,C,P:Q)         */
public class String_joiner {
	public static void main(String[] args) {
		// we use prfix and suffix to wrapp the data in string joiner 
		// as shown below
		
//		StringJoiner sj1 = new StringJoiner(",");//normal
		StringJoiner sj1= new StringJoiner(",","[","]");
		sj1.add("A").add("B").add("C");
		System.out.println(sj1);
		
		StringJoiner sj2 =  new StringJoiner(":");
		sj2.add("P").add("Q");
		System.out.println(sj2);
		
		sj1.merge(sj2);
		System.out.println(sj1);
		
		
		
	}

}
