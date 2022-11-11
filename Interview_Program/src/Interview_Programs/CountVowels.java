package Interview_Programs;

public class CountVowels {
	public static void main(String[] args) {
		String a="Somesh Ghuge";
		int count=0;
		int count2=0;
		String b=a.toLowerCase();
		for(int z=0;z<=a.length()-1;z++) {
			if(a.charAt(z)=='a'||a.charAt(z)=='e'||a.charAt(z)=='i'||
					a.charAt(z)=='o'||a.charAt(z)=='u') {
				count++;
				
			}else {
				count2++;
			}
		}
		System.out.println("Vowels are : "+count+"\nNon owels are : "+count2);
	}

}
