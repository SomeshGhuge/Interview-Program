package Interview_Programs;

import java.util.StringJoiner;

/*
  Using Java 1.8 Features
 Output:-->
           A,B,C,
           P:Q
           merge this to strings  (A,B,C,P:Q)         */
public class String_joiner {
	public static void main(String[]args) {
		
		StringJoiner str=new StringJoiner(",");
		str.add("A");
		str.add("B");
		str.add("C");
		
		StringJoiner str1=new StringJoiner(":");
		str1.add("P");
		str1.add("Q");
		
		str.merge(str1);
		System.out.println(str);
	}
}
