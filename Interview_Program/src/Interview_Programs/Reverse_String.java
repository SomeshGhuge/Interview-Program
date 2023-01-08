package Interview_Programs;
import java.util.*;
public class Reverse_String {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your new String");
		String str=scanner.nextLine();
		 getReverseString(str);
	}
	public static String getReverseString(String str) {
		String str1=" ";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			str1=ch+str1;	
		}
		System.out.println(str1);
		return str1;
		
	}
}
