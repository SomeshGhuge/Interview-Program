package Interview_Programs;

import java.util.Arrays;
import java.util.Scanner;

// write a program for min and max array
public class Min_Max_Array {
	public static void main(String[]args) {

			List<Integer> al =Arrays.asList(1,2,3,11,12,13,15);
		
		System.out.println("Minimum Value : "+al.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE));
		System.out.println("Maximun Value : "+al.stream().max(Integer:: compareTo).orElse(Integer.MIN_VALUE));


		
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
