package Loop_Statements;
//   4. Design method int factorial(int no)  
//   which returns int value to that method. print the results into main method 
//   (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)

public class Assignment6_4 {
	public int factorial(int number) {// method syntax
//access specifier-->return type-->method name-->(argument)-->{-->statements-->return-->}
		int fact=1;
		for(int a=1;a<=number;a++) {
			
			 fact=fact*a;
			}
		return fact;
	}
	public static void main(String []args) {
		Assignment6_4 asdf=new Assignment6_4();
		int result=asdf.factorial(5);
		System.out.println("Your factorial value is "+result);
	}
		
	
	

}
