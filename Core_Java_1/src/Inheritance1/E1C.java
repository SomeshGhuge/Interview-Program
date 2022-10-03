package Inheritance1;
import java.util.Scanner;
public class E1C  {
	public static void main(String[]args) {
	
			
			Scanner scanner = new Scanner(System.in);
			E1A e1a=new E1B();
			E1B e1b=new E1B();
			e1b=(E1B)e1a;
			
			System.out.println("Enter your Firstname ");
			String a= scanner.nextLine();
			System.out.println("Enter your Fathername ");
			String b= scanner.nextLine();
			System.out.println("Enter your lastname ");
			String c= scanner.nextLine();
			System.out.println("Enter your Mobail Number ");
			String d= scanner.next();
			System.out.println("Enter your  Classname");
			String f=scanner.next();
			System.out.println("Enter your Pancard Number ");
			String e= scanner.next();
			
			e1b.setstudentname(a);
			e1b.setfathername(b);
			e1b.setsurname(c);
			e1b.setpancard(e);
			e1b.setmobile_no(d);
			e1b.setclassname(f);
			e1b.getmobile_no(d);
			
	     	
			System.out.println("Your details are "+e1b.getstudentname() +" "+ e1b.getfathername()+" " + e1b.getsurname()+"\n Your mobile number is"+e1b.getmobile_no(d)+"\n Your classname is"+e1b.getclassname()+"\n Your pancard number is"+e1b.getpancard());
			
		// input detana space dila don word madhe tr value udchyachi save hoyli
			
	}
}

	


