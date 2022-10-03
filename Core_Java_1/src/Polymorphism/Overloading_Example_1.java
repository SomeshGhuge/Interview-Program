package Polymorphism;

public class Overloading_Example_1 extends Thumb {
	
	    void getMobilePattern(Thumb thumb){//to get Thumb We have to decleare Thumb Class
		 System.out.println("This is Thumb");
		}
		void getMobilePattern(int number){
		//logic here
			 System.out.println("This is int "+number);
		}
	    void getMobilePattern(int x1, int y1, int x2, int y2){
		//logic here
			 System.out.println("This is multi"+x1 +y1+x2+y2);
		}
public static void main(String[]args) {
	Overloading_Example_1 somya=new Overloading_Example_1();
	somya.getMobilePattern(somya);
	somya.getMobilePattern(new Thumb());
    somya.getMobilePattern(new Overloading_Example_1());
    somya.getMobilePattern(1);
    somya.getMobilePattern(2,54, 25, 256);
}

}
