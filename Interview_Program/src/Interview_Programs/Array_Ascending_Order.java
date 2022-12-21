package Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Write a code for array Ascending order
// int[] intArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};

public class Array_Ascending_Order {
public static void main(String[] args) {
		
		int [] array= {52, 45, 32, 64, 12, 87, 87,78, 98, 23};
		
		
		Arrays.sort(array);
		System.out.println("largest number-->"+array[array.length-1]+" \nSecond Largest Number is --->"+array[array.length-2]);
		
		System.out.println("\n\n<----This the First Way----->");
		for(int a:array) {
			System.out.println(a);
		}
		
		
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(52);
		list.add(45);
		list.add(32);
		list.add(64);
		list.add(12);
		list.add(87);
		list.add(87);
		list.add(78);
		list.add(98);
		list.add(23);
		Collections.sort(list);
		System.out.println("This is Second way");
		System.out.println(list);
		
		System.out.println("<----This the Third Way----->");
		for(int i:list) {
			System.out.println(i);	
		}
		
		System.out.println("<----This the FOurth Way----->");
		System.out.println(list.stream().sorted().toList());
		
		// when i want only one number from list
		System.out.println(list.stream().sorted().filter(x->(x==23)).collect(Collectors.toList()));
		
	
			}

}
