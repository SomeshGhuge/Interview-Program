package Interview_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Create the list of all even number which are greater than 5

public class List_Contain_Number_GreterThan_5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

//first Way
		for(int a:list) {
			if(a%2==0) {
				if(a>5) {
				System.out.println("Even numbers greater than 5-->"+a);
				}
			}
		}
		
//Second Way--->using java 1.8 features
	System.out.println("Even numbers >5 is -->"+list.stream().filter(x->(x>5)).filter(x->(x%2==0)).collect(Collectors.toSet()));

	}
}
