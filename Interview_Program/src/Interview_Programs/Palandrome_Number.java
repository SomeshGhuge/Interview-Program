package Interview_Programs;
import java.util.Scanner;
// palandrome number 
// 151 
public class Palandrome_Number {
	public static void main(String[]args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter your number");
//		int x=scanner.nextInt();
//		
		for(int i=1;i<=1000;i++) { 
			
		int a=0;
		a=i;
		int rem=0;
		int sum=0;
	
		for(sum=0;a>0;a=a/10) {
			rem=a%10;
			sum=sum*10+rem;
		}
		
		if(sum==i) {
			System.out.println("This number is palandrome number-->"+i);
		}
	  }
   }	
}
