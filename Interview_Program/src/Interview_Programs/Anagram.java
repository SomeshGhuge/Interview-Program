package Interview_Programs;

import java.util.Arrays;
import java.util.Scanner;

// write a program for anagram means cheak 
// whether two strings contain same or not


public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String1 ");
		String str1=scanner.next();
		System.out.println("Enter String2 ");
		String str2=scanner.next();
		
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()==str2.length()) {
			char [] array1=str1.toCharArray();
			char [] array2=str2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			boolean result = Arrays.equals(array1, array2);
			if(result) {
				System.out.println("This Strings are anagram strings");
			}else {
				System.out.println("This Strings are not anagram strings");
			}
		}else {
			System.out.println("This is not angram strings");
		}
	}

}
