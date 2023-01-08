package Interview_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// write a program to cpital cities
public class ArrayList_Capital_Cities {
	public static void main(String[]args) {
		List<String> s=new ArrayList<String>();
		s.add("Maharashtra");
		s.add("Gujrat");
		s.add("Pune");
		//s.add(null);// it is not sorted it gives null pointer exception
		System.out.println("This is the first way--->"+s);
		
		for(String i:s) {
			System.out.print(" "+i);
		}
		System.out.println("\nThis is 1.8 featue-->"+s.stream().sorted().toList());
		
		System.out.println("This is fourth way");
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
