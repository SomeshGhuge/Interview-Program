package Interview_Programs;
// prime number are 1,3,5,7,8...
import java.util.Scanner;

public class Prime_number {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int a=scanner.nextInt();
		int count=0;
		for(int i=1;i<=a;i++) {
			
			if(a%i==0) {
				count++;
			}
		}
		if(count<=2) {
			System.out.println("This is prime number");
		}else {
			System.out.println("This is not prime number");
		}

	     
	     if(isPrimeNumber(a)) {
	    	 System.out.println("This number is a prime number ");
	     }else {
	    	 System.out.println("This number is a not prime number");
	     }
	  
	}

	  public static boolean isPrimeNumber(Integer number) {
		return number > 1 &&  IntStream.range(2, number).noneMatch(i-> number % i == 0);
	  }
}
