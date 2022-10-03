package Abstraction;

 class IIB implements IIA {
	public void ma() {
		System.out.println(" This is ma");
	}
	
	public void asdf() {
		System.out.println("this is from interface b");
	}
	
	public static void main(String[]args) {
		IIB a=new IIB();
		a.asdf();
		a.ma();
	}

}
