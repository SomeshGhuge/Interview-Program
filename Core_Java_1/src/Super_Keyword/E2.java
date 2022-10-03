package Super_Keyword;

public class E2 extends E1{
	 String work;
	 String mobileno;
	 
	 E2 (String Name,int Id, String work, String mobileno){
		 super(Id,Name);
		 this.work=work;
		 this.mobileno=mobileno;
	 }
	 
 void display() {
	 System.out.println("Your name is "+Name+"\nYour Id is "+Id+"\nYour work is "+work+"\nYour mobileno "+mobileno);
	  }

}
