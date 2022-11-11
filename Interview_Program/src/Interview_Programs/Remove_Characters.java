package Interview_Programs;

import java.util.Scanner;

public class Remove_Characters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Statement");
		String s1=scanner.nextLine();
		
		System.out.println("Enter which letter yo dont want in that statement");
		
		String s2=scanner.next();
		
		char arr[]= new char[256];
		for(int i=0; i<s2.length(); i++) {
			arr[s2.charAt(i)]++;
		}
		String str=" ";
		for(int i=0;i<s1.length();i++) {
			if(arr[s1.charAt(i)]==0) {
				str+=s1.charAt(i);
				
			}
		}
		System.out.println(str);
	}
}