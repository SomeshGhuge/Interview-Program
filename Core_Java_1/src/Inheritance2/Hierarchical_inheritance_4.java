package Inheritance2;

public class Hierarchical_inheritance_4 extends Hierarchical_inheritance_2 {
	public void getStudent_name() {
		System.out.println("Your name is Somya");
	}
	
	public static void main(String[]args) {
		Hierarchical_inheritance_4 asdf=new Hierarchical_inheritance_4();
		Hierarchical_inheritance_3 asd= new Hierarchical_inheritance_3();
		asdf.getschool();
		asdf.getclassA();
		asdf.getStudent_name();
		
		System.out.println("\n");
		
		
		asd.getschool();
		asd.getclassA();
		asd.getStudentname();
	}
}
