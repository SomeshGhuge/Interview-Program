package Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Quetion{
	public static void main(String[]args) {

//   1. Given the following list of sorted integers:-----> 0 1 5 8 14 18 44 81 89 99 102
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(0);
		set.add(1);
		set.add(5);
		set.add(8);
		set.add(14);
		set.add(18);
		set.add(44);
		set.add(81);
		set.add(89);
		set.add(99);
		set.add(102);
		
		// we minimise the process by using java 1.8 feature
	System.out.println("Given List----->"+set.stream().sorted().toList());// we get orignal list
	// Using sorted function we sort int numbers from min to max
	// Using toList function we get output
	
		
//  2. Add 2 numbers--->	10 20
		
		set.add(10);
		set.add(20);
	System.out.println("Updated List--->"+set.stream().sorted().toList());// we get updated list
		
//  3. Find how many numbers are in between those 2 numbers in the original list,including those 2 numbers if present	
	// Here we write a code for get numbers count which are between this two number including itself
	
	List<Integer> All = set.stream().sorted().toList();
	Object[] a=All.toArray();
	int[] Array = new int[a. length]; // here we convert object array into int array
	int count=0;// here put the count of numbers in between 10 and 20
	for(int i = 0; i<a.length;i++) {
		int q=(int) a[i];
		if(q>=10 && q<=20) {
			count++;
			}
	  }
	System.out.println("The numbers between 10 and 20 including itself are--->"+count);  
	}	
}
