package Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate_number_in_Array {
	public static void main(String[]args) {
		int  a[]= {1,2,3,4,5,1,2,3,6,7,8,9};
		
		System.out.println("First way Duplicate number is-->");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]) {
					System.out.println(a[i]);
				}
			}
		}
		
		List<Integer> al=Arrays.asList(1,2,3,4,5,1,2,3,6,7,8,9);
		System.out.println("Second way duplicate number--->"+al.stream().filter(x->Collections.frequency(al, x)>1).collect(Collectors.toSet()));
		
	}
}
