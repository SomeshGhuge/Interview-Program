package Polymorphism;

public class Overloading2 {
	public static void main(String[]args) {
		Overloading1 asdf=new Overloading1();
		asdf.m1((5),( 4));
		asdf.m1(5, 'a', 40);
		asdf.m1("Somesh");
		asdf.m1('a');// data types lahan asel tr run hoto
		Overloading1.m1(4.0,5.0);


}
}
