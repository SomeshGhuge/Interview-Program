package Interview_Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Armstrong_number_UP_To_500 {
	public static void main(String[]args) {
		LinkedHashSet<Integer> al=new LinkedHashSet<Integer>();
       for(int i=1;i<=500;i++) {
			
			int sum=0;
			int rem=0;
			int j=i;	
			
			for(sum=0;j>0;j=j/10) {
				rem=j%10;
				sum=sum+rem*rem*rem;
			}
			if(sum==i) {
				al.add(i);
			}	
		}
   System.out.println("Armstrong Number Between 1 to 500--->"+ al);

	}
}