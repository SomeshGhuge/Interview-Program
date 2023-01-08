package Interview_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class duplicate_two_array_number {
	public static void main(String[]args) {
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> list2=Arrays.asList(1,2,3,11,12,13,14,15,16);
    
		System.out.println("First way Duplicate number in two array are --->");
			for(int i:list1){
			for(int j:list2) {
				if(i==j) {
					System.out.println(i);
				}
			  }
		    }
			
			System.out.println("\n second way---->");
			Stream<Integer> AllList=Stream.concat(list1.stream(), list2.stream());
			List<Integer> All=AllList.collect(Collectors.toList());
			Set<Integer> dupli=All.stream().filter(x->Collections.frequency(All,x)>1).collect(Collectors.toSet());
	        System.out.println(dupli);  
	}
        }

