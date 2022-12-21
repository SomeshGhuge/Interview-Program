package Interview_Programs;

import java.util.Arrays;

public class Largest_SecondLargest_Element_In_Array {
	

	public static void main(String[] args) {
	    	  
		  int a[]= {100000,50,40,80,60,101,150,200,30,15};
	
		Arrays.sort(a);	
		for(int s:a){
			System.out.print(" ["+s+"]");
		}
		System.out.println("\nLargest Number "+a[a.length-1]+"\nSecond Largest Number"+a[a.length-2]);		
	}
	
}
