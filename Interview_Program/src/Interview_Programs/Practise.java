package Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise {

	public static void main(String[]args) {
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = Arrays.asList(4,5,6,7,8,9);
		
	Stream<Integer> Alllists=Stream.concat(list1.stream(), list2.stream());
	System.out.println(Alllists);
	
	List<Integer>All=Alllists.collect(Collectors.toList());
	System.out.println("All Elements------------------->"+All);
	
	Set<Integer> Fulllist=All.stream().collect(Collectors.toSet());
	System.out.println("Full List without repeatation-->"+Fulllist);
	
	Integer min = Fulllist.stream().min((x1,x2)->(x1 - x2)).get();
	System.out.println("Minimum Number----------------->"+min);
	
	Integer max = Fulllist.stream().max((x1,x2)->(x1 - x2)).get();
	System.out.println("Miximum Number----------------->"+max);
	
	Set<Integer> Duplicates=All.stream().filter(e-> Collections.frequency( All, e)>1).collect(Collectors.toSet());
	System.out.println("Duplicates Number-------------->"+Duplicates);
	}
}
