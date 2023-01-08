package Interview_Programs;

import java.util.Arrays;
import java.util.Scanner;

// write a program for min and max array
public class Min_Max_Array {
	public static void main(String[]args) {
		int arr[]=new int[250];
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your array 10 numers");
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<10;i++) {
			arr[i]=scanner.nextInt();
			if(arr[i]<min) {
				min=arr[i];
			}else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Your minimum number is "+min);
		System.out.println("Your maximum number is "+max);
	}
}