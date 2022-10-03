package Return_Method;

public class Test2{
	public static  Test1 getEmployeeId() {// here we creat method accordimg to parent class name
		int id=80;// we provide the value which is not in privious method
		return new Test1(id);// here we provide new keyword to return info in privious class
	}
	
	

	public static void main(String[]args) {
		Test1 e=getEmployeeId();// here we load value in variable e by static method class name 
		System.out.println("Your value is "+e.id);
	}

}

