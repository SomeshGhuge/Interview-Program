package Operators;

//1.write a program to check the number is positive or negative

 import java.util.Scanner;
public class Assignment_5_1 {
	public static void main (String[]args) {
		System.out.println("Your number is");
		Scanner somya = new Scanner(System.in);
		int a=somya.nextInt();
		
		//int a= 20;
		
		if(a<0) {
			System.out.println(" Your number is negative"+"\n"+a);
		}else {
			System.out.println("Your number is Positive"+"\n"+a);
		}
	}

}
