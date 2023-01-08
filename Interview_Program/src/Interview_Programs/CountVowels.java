package Interview_Programs;

public class CountVowels {
	public static void main(String[]args) {
		String str="SOmesh Ghuge";
		int count=0;
		for(int i=0;i<str.length();i++) {
			String str1=str.toUpperCase();
			char ch=str1.charAt(i);
			if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
		System.out.println("owels is --->"+count);
	}
}
