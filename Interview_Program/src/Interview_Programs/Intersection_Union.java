package Interview_Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Intersection_Union {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,8};
		int arr2[]= {3,5,6,7,8,9};
		
		intersection(arr1,arr2);
		union(arr1,arr2);
		
		for(int i:arr1) {
			for(int b:arr2) {
				if(i==b) {
					System.out.println("duplicate number is-->"+i);
				}
			}
		}
	}
	static void intersection(int arr1[],int arr2[]) {
		Set <Integer> s = new HashSet<Integer>();
		for(Integer a:arr1) {
			for(Integer b:arr2) {
				s.add(a);
				s.add(b);
			}
		}
		System.out.println("This is an intersection-->"+s);
		
	}
	
	static void union(int arr1[],int arr2[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			al.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			al.add(arr2[i]);
		}
		System.out.println("This is unoin-->"+al);
		}
	}


