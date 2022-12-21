package Interview_Programs;

// I want lowercase up to middle after  that i want uppercase
// for example:--- "i am somesh I AM SOMESH "

import java.util.Scanner;
public class String_From_Middle {
	public static void main (String []args) {
	
		String lowercase="";
		String upercase="";
	    
		  
			    System.out.println("Enter your string");
				Scanner scanner= new Scanner(System.in);
				String str = scanner.nextLine();
				int str1=(str.length())/2;
			    System.out.println("If you want first part is  lowercase then press 'L'  or press 'U' ");
			    char ch=scanner.next().charAt(0);
			   
	       if (ch =='L'|| ch=='l') {
	    	  String str2=str.substring(0, str1);
	    	  lowercase=str2.toLowerCase();
	    	  String str3=str.substring(str1);
	    	  upercase=str3.toUpperCase();
	           System.out.println("Your Output is--->"+lowercase+" "+upercase);
		       }else {
				      String str3=str.substring(str1);
		              upercase=str3.toUpperCase();
		              String str2=str.substring(0, str1);
		    	      lowercase=str2.toLowerCase();
			          System.out.println("Your Output is--->"+upercase+" "+lowercase);
		         }
	     
	           
	        
		    
	}
}
