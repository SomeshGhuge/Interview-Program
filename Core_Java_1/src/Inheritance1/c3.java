package Inheritance1;
import java.util.Scanner;

public class c3 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		c1 a1=new c2();
		c2 a2=new c2();
		a2=(c2)a1;
	
		
		System.out.println("Enter the Criminal name");
		String a= scanner.next();
		System.out.println("Enter the Criminal  jail name");
		String b= scanner.next();
		System.out.println("Enter the Criminal crime ");
		String c= scanner.next();
		System.out.println("Enter the Criminal duration of jail");
		String d= scanner.next();
		System.out.println("Enter the Criminal background");
		String e= scanner.next();
		System.out.println("Enter the Criminal mobile number");
		String f= scanner.next();
		System.out.println("Enter the Criminal used weapon");
		String g= scanner.next();
		System.out.println("Enter the Criminal punishment");
		String h= scanner.next();
		
		a2.setname(a);
		a2.setjailname(b);
		a2.setcrime(c);
		a2.setduration(d);
		a2.setbackground(e);
		a2.setmobileno(f);
		a2.setweapon(g);
		a2.setpunishment(h);
		System.out.print("Details of criminal is as follows---->\n"+a2.getname()+"\n"+a2.getjailname()+"\n"+a2.getcrime()+"\n"+a2.getduration()+"\n"+a2.getbackground()+"\n"+a2.getmobileno()
		+"\n"+a2.getweapon()+"\n"+a2.getpunishment());
		
		//here in input we provide space then error happen why
		
		

		
		
		
	}

}
