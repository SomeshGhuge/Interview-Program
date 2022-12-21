package Interview_Programs;

import java.util.Scanner;

// 0,1,1,2,3,5,8....upto 20
public class Fabonacchi_series {
	public static void main(String[]args) {

		int a=0;
		int b=1;
		int c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter Number");
		int number=scanner.nextInt();
	for(int i=0;i<number;i++) {
		c=a+b;
		a=b;
		b=c;
		if(c<number) {
			System.out.println(c);
		}
	}
		
		
	}

}
