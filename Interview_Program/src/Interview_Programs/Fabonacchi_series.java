package Interview_Programs;

import java.util.Scanner;

// 0,1,1,2,3,5,8....upto 20
public class Fabonacchi_series {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int d=scanner.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<d;i++) {
			c=a+b;
			if(c<d) {
				System.out.println(c);
			}
			a=b;
			b=c;
			
		}
		
		
	}
}
