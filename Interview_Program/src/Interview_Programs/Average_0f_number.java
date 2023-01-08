package Interview_Programs;

import java.util.Scanner;

public class Average_0f_number {
	public  int getaverage(int n1,int n2,int n3,int total) {
		int Average=(n1+n2+n3)/total;
		return Average;
		
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		 Average_0f_number a= new  Average_0f_number();
		System.out.println("Enter your First Number");
		int n1=scanner.nextInt();	
		System.out.println("Enter your Second Number");
		int n2=scanner.nextInt();
		System.out.println("Enter your Third Number");
		int n3=scanner.nextInt();
		System.out.println("Enter your Total Numbers");
		int total=scanner.nextInt();
		int b=a.getaverage(n1, n2, n3, total);
		System.out.println("This is output from method-->"+b);
	int Average=(n1+n2+n3)/total;
	System.out.println("This is output from simpal way-->"+Average);
		
	}

}
