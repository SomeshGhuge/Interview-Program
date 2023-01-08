package Interview_Programs;

// I want lowercase up to middle after  that i want uppercase
// for example:--- "i am somesh I AM SOMESH "

import java.util.Scanner;
public class String_From_Middle {

	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your String Here");
		
		String name=scanner.nextLine();
		String str1=name.substring(0, name.length()/2);
		String str2=name.substring(name.length()/2,name.length());
		
		System.out.println("Which case you want first--->\nPress L for lowercase---Press U for uppercase");
		char ch=scanner.next().charAt(0);
		if(ch=='L'||ch=='l') {
			String str3=str1.toLowerCase();
			String str4=str2.toUpperCase();
			System.out.println(str3+str4);
		}else {
			String str5=str1.toUpperCase();
			String str6=str2.toLowerCase();
			System.out.println(str5+str6);
		}
		
		
	}
}
