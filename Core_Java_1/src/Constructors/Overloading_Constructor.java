package Constructors;

public class Overloading_Constructor {
	int id;
	String name;
    String city;
    String Userlocation;
    protected Overloading_Constructor(int id,String name,String city) {
    	// at the time of over loading in construction we must have to use the keyword "this"
    	this.id=id;
    	this.name= name;
    	this.city=city;
    	
    }
    public Overloading_Constructor(int userid,String username) {
    	//this another constructor is known as overloading constructor
    	this.id=userid;
    	this.name=username;
    }
    public Overloading_Constructor(String Userlocation) {
    	this.Userlocation=Userlocation;
    	//ther is no limit to creat the constructors we only cheak no constructor is reapeat.
    }
   public static void main(String[]args) {
	   Overloading_Constructor asdf=new Overloading_Constructor(112,"Somya","Latur");
	   Overloading_Constructor asdf1=new Overloading_Constructor("Ghuge Niwas");
	System.out.println("User id is "+asdf.id+"\nUser name is "+asdf.name);
	System.out.println("User city"+asdf1.Userlocation);
	System.out.println("User id is-->"+asdf.id+"\nUser name is--> "+asdf.name+"\nUser city is--->"+asdf.city+"\nUser Location--->"+asdf1.Userlocation);
	   
   }
}
