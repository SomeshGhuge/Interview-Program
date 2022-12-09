package Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_List_Join_min_max {
	public static void main(String[] args) {
		
// Arrays.asList is used to get list
	List<Integer> list1= Arrays.asList(1,2,3,4,5,6);
	List<Integer> list2= Arrays.asList(4,5,6,7,8,9);

// This is used to join these two lists
	Stream<Integer> FullList= Stream.concat(list1.stream(), list2.stream());
    System.out.println(FullList);// Here we will get hashcode because We only join two lists

// To get full list
	List<Integer> AllElements = FullList.collect(Collectors.toList());
	System.out.println("All Elements----> "+AllElements);

// To get Unique Elements
	Set<Integer> UniqueElements=AllElements.stream().collect(Collectors.toSet());
	System.out.println("Unique Elemets--> "+UniqueElements);
	
// To get Duplicates
	Set<Integer> duplicates= AllElements.stream().filter(e-> Collections.frequency( AllElements, e)>1).collect(Collectors.toSet());
	System.out.println("Duplicate are---> "+duplicates);

// To get Maximum Number
	Integer Max=UniqueElements.stream().max((x1,x2)-> x1 - x2).get();
	System.out.println("Maximum Number--> "+Max);
	
// To get Minimum Number
		Integer Min=UniqueElements.stream().min((x1,x2)-> x1 - x2).get();
		System.out.println("Minimum Number--> "+Min);

	}
}
