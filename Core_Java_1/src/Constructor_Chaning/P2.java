package Constructor_Chaning;

public class P2 extends P1 {
	 P2(){
		super(5);
		System.out.println("This is from P2 class");
	}
	P2(String nam){
		System.out.println("This is from second from P2");
	}
	public static void main(String[]args) {
		P2 p=new P2();
		P2 p2 = new P2("Somya");
		
		
	}

}
