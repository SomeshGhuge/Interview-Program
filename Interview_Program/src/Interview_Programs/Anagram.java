package Interview_Programs;
        import java.util.Arrays;
        import java.util.Scanner;
        
// write a program for anagram means cheak 
// whether two strings contain same or not

public class Anagram {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your First string");
		String String1=scanner.nextLine();
		System.out.println("Enter your Second string");
		String String2=scanner.nextLine();
		
	   String str1= String1.toUpperCase();
	   String str2= String2.toUpperCase();
	   
	if(str1.length()==str2.length()) {
		char Array1[]=str1.toCharArray();
		char Array2[]=str2.toCharArray();
		// it will cheak the to arrays are equal or not
		boolean Result=Arrays.equals(Array1, Array2);
		
		   if(Result) {
			   System.out.println("This is Anagram String");
		   }else {
			   System.out.println("This is not Anagram String");
		   }
		   
	   }else {
		   System.out.println("This is not a Anagram String");
	   }
	   
	}
}








