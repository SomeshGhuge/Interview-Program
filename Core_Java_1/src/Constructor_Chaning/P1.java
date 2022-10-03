package Constructor_Chaning;

public class P1 {
	String name;
	
	P1(){
		System.out.println("This is a p1 class first");
	}
	 P1(int x){
		this("omya");
		int y=x+x+x+x;
		System.out.println("This is p1 class second"+y);
	}
	private P1 (String name){
		this();
		System.out.println("This is p1 from class third"+name);
	}

}
