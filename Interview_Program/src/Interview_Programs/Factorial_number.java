package Interview_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1-->1
//2-->2
//3-->6
//4--->24.....
public class Factorial_number {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number for which u want to get factorial");
		int a =scanner.nextInt();
		getFactorial(a);
	}
	static void getFactorial(int a) {
		List<Integer> factorial=new ArrayList<Integer>();
		int fact = 1;	
		for(int i=1;i<=a;i++) {
			fact=i*fact;
			factorial.add(fact);
		}
		System.out.println("Your factors are--->"+fact);
	}
}
