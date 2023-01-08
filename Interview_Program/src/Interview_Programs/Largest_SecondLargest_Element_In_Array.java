package Interview_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_SecondLargest_Element_In_Array {
	
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		Arrays.sort(arr);
		System.out.println("Largest number is-->"+arr[arr.length-1]+"\nSecond largest number is-->"+arr[arr.length-2]);
	
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter how many numbers of array u want");
	int size=scanner.nextInt();
	int array[]=new int[size];
	for(int i=0;i<size;i++) {
		System.out.println("Enter numbers in array one by one");
		
		array[i]=scanner.nextInt();
		if(array[i]<size) {
			array[i]++;
		}
	}
	Arrays.sort(array);
	System.out.println("Largest number is-->"+array[array.length-1]+"\nSecond largest number is-->"+array[array.length-2]);
	
	
	}	
}
