package Interview_Programs;

import java.util.Scanner;

public class String_Num_sum {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your String here");
		String str1=scanner.nextLine();
		int sum=0;
		for(int i=0;i<str1.length();i++) {
			if(Character.isLetter(str1.charAt(i))) {
				continue;}
			else {
				sum=Integer.parseInt(""+str1.charAt(i));}
			sum++;
		}
		System.out.println(sum);
	}

}
