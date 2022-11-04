package Factory_Design_Pattern;

public class Info {/*

   Factory Design Pattern:--->
        Design the factory method in which multiple objects are stored
        called as factory design pattern.
               
               
               
Why...........?
      Sometime our application or frameworks don’t know what kind of 
object has to create at run time. It only knows when it has to create.
      Another issue is that class will contain object of another 
classes, this can be easily achieved by just using the new keyword and
the class constructor. The problem with this approach is that it is 
very hard coded approach to create the object as this creates 
dependency between two classes.
      To overcome this above situation, we should go for 
factory pattern.



When..............?
         When user wants the specific object at run time.


Example:-------->
       Suppose we have requirement to book AC ticket for First tier,
        second tier and Third tier.
        
        

Step 1- create the interface Booking.
Step 2- create the concreate class First tier will implement the 
        same interface
Step 3- create the concreate class Second tier will implement the 
        same interface
Step 4- create the concreate class Third tier will implement the
        same interface
Step 5- create class BookingFactory to generate the object of 
        concreate class.
Step 6- Create the factory class to get the object of concreate class
         by passing the data.



*/

}
