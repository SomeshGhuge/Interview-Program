package Interview_Programs;
import java.util.*;
public class Reverse_String {
	public static String getReverseString(String reverse) {
		String a=" ";
		for(int i=0;i<reverse.length();i++) {
			char ch=reverse.charAt(i);
			a=ch+a;
		}
		return a;
}
	public static void main(String[]args) {

		System.out.println(getReverseString("Somesh"));

		
	}
}
