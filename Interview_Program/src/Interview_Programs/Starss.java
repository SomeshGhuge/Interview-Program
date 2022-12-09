package Interview_Programs;

public class Starss {
	public static void main(String args[]) {
	// For print ***** like 5 lines
	
	
	 /*	for(int i=1;i<=5;i++) {
	
			for(int j=1;j<=5;j++) {
				System.out.println("*");
			}
			System.out.println();
		} */
	/*
	  // Right Triangle
	  
	  	int value =1;
		for (int i=1;i<=5;i++) {
			int a=value*i;
			if(a==1) {
				System.out.println("*");
			}
			if(a==2) {
				System.out.println("**");
			}
			if(a==3) {
				System.out.println("***");
			}
			if(a==4) {
				System.out.println("****");
			}
			if(a==5) {
				System.out.println("*****");
			}
			
		}
		for (int i=4;i>=1;i--) {
			int a=value*i;
			if(a==1) {
				System.out.println("*");
			}
			if(a==2) {
				System.out.println("**");
			}
			if(a==3) {
				System.out.println("***");
			}
			if(a==4) {
				System.out.println("****");
			}
			if(a==5) {
				System.out.println("*****");
			}
	}     
		*/
		
		
		
		
		for (int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
