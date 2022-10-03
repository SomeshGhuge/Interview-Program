package Inheritance2;

public class Multipal_Inheritance_1 {
//multiple inheritance:-
// When a single class is inherits from multiple parent class is known as multiple inheritance
//multiple inheritance is not used in java
//when a subclass tries to extends multiple parent classes then this show compile time error
	
//Why multiple inheritance not supported in java in case of classes?

//---->	Class base has test () method and class derived has also test () method.
//----> Class test extends Base, Derived, which test method It will called  diamond ambiguity. 
//----> so that’s why multiple inheritance does not supports in java.

//Class A           Class B	
	
//   	Class C---> it achive data from A and B both parent class
	
	
 void m1() {
	 System.out.println("Your output from m1--->1");
	 
 }

}
