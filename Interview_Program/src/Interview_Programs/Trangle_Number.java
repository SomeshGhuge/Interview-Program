package Interview_Programs;
/*
Write a program to print the following pattern
Input - 4
Output - 
1
1 2
1 2 3
1 2 3 4
 */
public class Trangle_Number {
	public static void main(String[]args) {
		int a=4;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();			
		}
	}
}
