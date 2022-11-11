package Interview_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// write a program to cpital cities
public class ArrayList_Capital_Cities {
	public static void main(String[] args) {
		
	List <String> capitalCities = new ArrayList<String>();
	
        capitalCities.add("Maharashtra");
        capitalCities.add("Gujrat");
        capitalCities.add("Mizoram");
        capitalCities.add("Bihar");
        capitalCities.add("Delhi");
        capitalCities.add("Bengluru"); 
        capitalCities.add("Patna");
        capitalCities.add("Ahmdabad");
        capitalCities.add("Nagaland");
        capitalCities.add("Punjab");
        
        Collections.sort(capitalCities);
// First Way
        System.out.println("By using ForEach Loop--->");
        for(String name:capitalCities) {
        	System.out.println(name);
        }
        
// Second way.
        System.out.println("\nUsing java 1.8 features-->");
        System.out.println(capitalCities.stream().sorted().toList());

// Third Way
        System.out.println("\nUsing normal way");
        System.out.println(capitalCities);
        
// Fourth Way
        System.out.println("\nUsing iterator way");
        Iterator<String> itr=capitalCities.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        	
        }
	}

}
