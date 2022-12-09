package Interview_Programs;

import java.util.Scanner;

// write a program for min and max array
public class Min_Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
	       int arr[]=new int[10];
	       System.out.println("Enter elements in array:");
	       int Min=Integer.MAX_VALUE;
	       int Max=Integer.MIN_VALUE;
	       for(int i=0;i<=9;i++)
	       {
	         arr[i]=sc.nextInt();
	         if(arr[i]<Min)
	           {
	           Min=arr[i];
	           }
	         if(arr[i]>Max)
	         {
	           Max=arr[i];
	         }
	       }
	       System.out.println("Maximum element is "+Max);
	       System.out.println("Minimum element is "+Min);
	       
	}

}