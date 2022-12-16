package Interview_Programs;
import java.util.Scanner;
// palandrome number 
// 151 
public class Palandrome_Number {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your number--->");
		int a =scanner.nextInt();
		int rem,sum=0;
		int num=a;
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
			sum= sum*10+rem;
		}
		if(sum==a) {
			System.out.println("Your number is a plandrome number");
		}else {
			System.out.println("Your number is not palandrome number");
		}
		
	}

}
