package Interview_Programs;
//153=1^3+5^3+3^3=153
import java.util.Scanner;
public class Armstrong_number{
	public static void main(String[]args) {
		Scanner scanner= new Scanner(System.in);
		Armstrong_number a=new Armstrong_number();
		System.out.println("Enter Number");
		int num=scanner.nextInt();
		int Number=num;
		int sum;
		int rem=0;
		
		for(sum=0;num>0;num=num/10 ) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			
		}
		
		if(sum==Number) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong Number");
		}
		
		
	}
}