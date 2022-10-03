package Operators;

//4.Write a program to print month of year.
//Case 1 January case 2 February case n....use switch case


public class Assignment5_4 {
	
	public static void main(String[]args) {
		String month= "May" ;
		switch(month) {//always remember the switch condition is must be initialise first
		case "janewary":
			System.out.println("Your month is Janewary");
			break;
		
		case "feb":
			System.out.println("Your month is feb");
			break;
		
		case "march":
			System.out.println("Your month is march");
			break;
			
		case "april":
			System.out.println("Your month is  Aprill");
			break;
			
		case "May":
			System.out.println("Your month is MAY");
			break;
			
		default :
			System.out.println("Invalid input");
			
			
			
		}
		
	}

}
