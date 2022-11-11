package Interview_Programs;

import java.util.HashSet;
import java.util.Set;

public class Intersection_Union {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,8};
		int arr2[]= {3,5,6,7,8,9};
		System.out.println("This is an intersection-->");
		intersection(arr1,arr2);
		union(arr1,arr2);
	}
	static void intersection(int arr1[],int arr2[]) {
		Set <Integer> s = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			s.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(s.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
		
	}
	
	static void union(int arr1[],int arr2[]) {
		Set <Integer> s = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			s.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			s.add(arr2[i]);
		}
		System.out.println("This is unoin-->"+s);
		}
	}


