package Interview_Programs;
        import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
        
// write a program for anagram means cheak 
// whether two strings contain same or not

public class Anagram {
	public static void main(String[]args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your first string");
		String Str1=scanner.nextLine();
		System.out.println("Enter your second string");
		String Str2=scanner.nextLine();
		
		String str1=Str1.toLowerCase();
		String str2=Str2.toLowerCase();
		
		if(str1.length()==str2.length()) {
			
			char Array1[] =str1.toCharArray();
			char Array2[] =str2.toCharArray();
			
			boolean  result=Arrays.equals(Array1, Array2);
			
			if(result) {
				System.out.println("This is anagram string");
			}else {
				System.out.println("This is not anagram string");
			}
			
			
			
		}else {
			System.out.println("This two strings are not anagram");
		}
	}
}















