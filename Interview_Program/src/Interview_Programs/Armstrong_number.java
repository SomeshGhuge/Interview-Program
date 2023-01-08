package Interview_Programs;
//153=1^3+5^3+3^3=153
import java.util.Scanner;
public class Armstrong_number{
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your armstrong value");
		int a=scanner.nextInt();
		
		int sum,rem,num=0;
		num=a;
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
			sum=sum+rem*rem*rem;
		}
		if(sum==a) {
			System.out.println("This is anagram number");
		}else {
			System.out.println("This is not anagram number");
		}
	}
}