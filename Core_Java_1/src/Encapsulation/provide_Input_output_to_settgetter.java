package Encapsulation;
import java.util.Scanner;
public class provide_Input_output_to_settgetter {
	public static void main(String[]args) {
		System.out.println("Enter salary");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		Use_of_Setter_Getter somya=new Use_of_Setter_Getter();
		somya.setSalary(a);
		System.out.println("Salary of somya is-->"+somya.getsalary());
	}

}
