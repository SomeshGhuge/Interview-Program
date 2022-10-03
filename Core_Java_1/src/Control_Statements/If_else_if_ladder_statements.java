package Control_Statements;

public class If_else_if_ladder_statements {
	public static void main(String[]args) {//used for true or false type
		
		int marks = 86;
		 
		if (marks>90) {
			System.out.println("Your grade is A");
		}else if( (marks<=90) && (marks >80) ) {
			System.out.println("Your grade is B");
		}else if ((marks<= 80) && (marks >60)) {
			System.out.println("Your grade is C");
		}else {
			System.out.println("Abhyas kar be fail zalas kutrya");
		}
	}
}

	


