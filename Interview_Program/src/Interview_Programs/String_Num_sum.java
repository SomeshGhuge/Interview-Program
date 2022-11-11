package Interview_Programs;

import java.util.Scanner;

public class String_Num_sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a string:");
		
		String str = sc.nextLine();
	
		int sum=0;
		
		for(int i=0;i<str.length();i++){
			
		if(Character.isLetter(str.charAt(i))) {
			
		continue; }
		
		else {
		sum=Integer.parseInt(""+str.charAt(i)); } 
		sum++;
		}
		
		System.out.println(sum); 
		
		
		}

}
