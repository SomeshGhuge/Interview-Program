package Interview_Programs;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Quetion:--->  AAAABBCDDD  count A B C D ..?
// Answer:---->  A=4,B=2,C=1,D=3

public class count_Charactor {
	
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your String input");
		String str=scanner.nextLine();
	//	getCharCount(str);
		
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	   for(int i=0;i<str.length();i++) {
		   char ch=str.charAt(i);
		   if(map.containsKey(ch)) {
			   map.put(ch, map.get(ch)+1);
		   }else {
			   map.put(ch, 1);
		   }
	   }
	   System.out.println(str+" : "+map);
	//	map.forEach((k,v)->System.out.println(k+" "+v));
		
		
	}
	public static void getCharCount(String str) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char ch[]=str.toCharArray();
		
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(str+" : "+map);
	
	}
}
