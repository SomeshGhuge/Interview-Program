package Interview_Programs;

import java.util.Scanner;

public class Reverse_Hello_World{
	public static void main (String[]args) {
		String str="Hello World";
		String str1=" ";
		String str2 =" ";
		
		for(int i=0;i<str.length()/2;i++) {
			char ch=str.charAt(i);
			str1=ch+str1;
		}
		for(int i=str.length()/2;i<str.length();i++) {
			char ch=str.charAt(i);
			str2=ch+str2;
		}
		System.out.println(str1+" "+str2);
	}
}
