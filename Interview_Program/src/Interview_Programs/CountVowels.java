package Interview_Programs;

public class CountVowels {
	public static void main(String[] args) {
		String a="Somesh Ghuge";
		int count=0;
		int count2=0;
		String b=a.toLowerCase();
		for(int z=0;z<b.length();z++) {
			if(b.charAt(z)=='a'||b.charAt(z)=='e'||b.charAt(z)=='i'||
					b.charAt(z)=='o'||b.charAt(z)=='u') {
				count++;
				
			}else {
				count2++;
			}
		}
		System.out.println("Vowels are : "+count+"\nNon owels are : "+count2);
	}

}
