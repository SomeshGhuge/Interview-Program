package Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your First String");
		String str=scanner.nextLine();
		System.out.println("Enter your Second String");
		String str1=scanner.nextLine();
		String str2=str.toLowerCase();
		String str3=str.toLowerCase();
		
		if(str2.length()==str3.length()) {
			
			
			char ch1[]=str2.toCharArray();
			char ch2[]=str3.toCharArray();
			boolean results=Arrays.equals(ch1, ch2);
			
			if(results) {
				System.out.println("This is anagram String");
			}else {
				System.out.println("This is Not a Anagram String");
			}
		    
		}else {
			System.out.println("This is Not Anagram String");
		}
	}
}
