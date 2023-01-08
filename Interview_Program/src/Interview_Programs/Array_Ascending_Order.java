package Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

// Write a code for array Ascending order
// int[] intArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};

public class Array_Ascending_Order {
	public static void main(String[]args) {
		int array[] = {52,45,32,64,12,87,78,98,23,7};
		Arrays.sort(array);
		System.out.println("Largest number in Array---> "+array[array.length-1]+"\nSecond Largest Number in Array--->"+array[array.length-2]);
		System.out.println("\nThis is first way to iterate-->");
		for(int i:array) {
			System.out.print(" "+i);
		}
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(52);
		al.add(45);
		al.add(32);
		al.add(64);
		al.add(12);
		al.add(87);
		al.add(78);
		al.add(98);
		al.add(23);
		al.add(7);
		
		Collections.sort(al);
		System.out.println("\n\nThis is a second way--->"+al);
		
		
		System.out.println("This is Third way ----->"+al.stream().sorted().toList());
		
		Iterator itr=al.iterator();
		System.out.println("This is Fourth way");
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}
		
		
		System.out.println("\nThis is fifth way");
		for(Integer i:al) {
			System.out.print(" "+i);
		}
		
		// when i want only one number from list
		System.out.println("\nYour number is-->"+al.stream().sorted().filter((x->(x==98))).collect(Collectors.toList()));
		
		
		
		
	}


}
