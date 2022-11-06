package Interview_Programs;


import java.util.HashMap;
import java.util.Map;

// Quetion:--->  AAAABBCDDD  count A B C D ..?
// Answer:---->  A=4,B=2,C=1,D=3

public class count_Charactor {
	
	public static void getCharCount(String name) {
		char Array[]=name.toCharArray();
		Map<Character,Integer> charmap=new HashMap<Character,Integer>();
		
		for(char c:Array) {
			if(charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
			}else {
				charmap.put(c, 1);
			}
		}
		System.out.println(name+" : "+charmap);
	}
	
	public static void main(String[] args) {
		getCharCount("AAAABBCDDD");
	}
}
	
	