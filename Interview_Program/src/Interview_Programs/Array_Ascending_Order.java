package Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Write a code for array Ascending order
// int[] intArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};

public class Array_Ascending_Order {
	public static void main(String[] args) {
		
		int [] array= {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};
		
// First Way	
		System.out.println("this is a iterator way--->");
		Arrays.sort(array);
		for(int a:array) {
			System.out.println(a);
		}
		
//Second Way
		System.out.println("\nYour Ascending order array is--->");
		System.out.println(Arrays.toString(array));
		
//Third Way
		List<Integer> list = new ArrayList<Integer>();
	        list.add(52);
			list.add(45);
			list.add(32);
			list.add(64);
			list.add(12);
			list.add(87);
			list.add(78);
			list.add(98);
			list.add(23);
			list.add(7);
			Collections.sort(list);
			System.out.println("\nThis is a collection way--->");
			System.out.println(list);
			
// Fourth way
		System.out.println("\nThis is java 1.8 feature way--->");
		System.out.println(list.stream().sorted().toList());
	}

}
