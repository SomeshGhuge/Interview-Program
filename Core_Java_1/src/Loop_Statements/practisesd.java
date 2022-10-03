package Loop_Statements;
//4. Design method int factorial(int no)  
//which returns int value to that method. print the results into main method 
//(Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)

public class practisesd {
	public int somya(int number) {
		int fact=1;
		for(int a=1;a<=number;a++) {
			fact=fact*a;
		}
		return fact;
		
	}
	public static void main(String[]args) {
		practisesd p=new practisesd();
		System.out.println("Your factorial value is "+p.somya(10));
		
	}

}
