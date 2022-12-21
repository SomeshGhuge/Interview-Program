package Interview_Programs;


import java.util.HashMap;
import java.util.Map;

// Quetion:--->  AAAABBCDDD  count A B C D ..?
// Answer:---->  A=4,B=2,C=1,D=3

public class count_Charactor {
	
	public static void main(String[]args) {
		getCharCount("AAAABBBCCD");
	}
	public static void getCharCount(String str) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char array[]= str.toCharArray();
		for(char c:array){
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(str+" : "+map);
	}
}
	
	