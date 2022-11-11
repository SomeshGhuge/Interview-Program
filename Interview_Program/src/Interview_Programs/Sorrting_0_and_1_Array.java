package Interview_Programs;

import java.util.Arrays;

// sort the zeros and ones in an array
// input---->{0,1,0,0,1,0,1,1,0,0,0,0,1,1,0,}
// output--->{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1}

public class Sorrting_0_and_1_Array {
	public static void main(String[] args) {
		int a[]= {0,1,0,0,1,0,1,1,0,0,0,0,1,1,0,};
	    
		Arrays.sort(a);		
//first way
		System.out.println("Your Sorted Arrays are-->"+Arrays.toString(a));		
//Second Way
		for(int num:a) {
			System.out.print(num);
		}	
	}

}
