package Interview_Programs;


import java.util.HashMap;
import java.util.Map;

// Quetion:--->  AAAABBCDDD  count A B C D ..?
// Answer:---->  A=4,B=2,C=1,D=3

public class count_Charactor {
	
	public static void getCharCount(String str) {
		char Array[]=str.toCharArray();
		Map<Character,Integer> str1=new HashMap<Character,Integer>();
		
		for(char c:Array) {
			if(str1.containsKey(c)) {
				str1.put(c, str1.get(c)+1);
			}else {
				str1.put(c, 1);
			}
		}
		System.out.println(str+" : "+str1);
	}
	
	public static void main(String[] args) {
		getCharCount("AAAABBCDDD");
	}
}
	
	