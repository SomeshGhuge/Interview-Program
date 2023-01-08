package Interview_Programs;

public class Reverse_String_Using_Recursion {
	public static void main(String[]args) {
		String str="Somesh";
		getReverse(str);
	}
	public static void getReverse(String str) {
		if(str.length()==0 || str.length()<=1) {
			System.out.println(str);
		}else {
			System.out.print(str.charAt(str.length()-1));
			getReverse(str.substring(0,str.length()-1));
		}
	}
}
