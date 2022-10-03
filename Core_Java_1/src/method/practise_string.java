

package method;

public class practise_string {
	 String fullname(String firstname,String fathername,String lastname) {
		String fullname= firstname+" "+fathername+" "+lastname;
		return fullname;
		
		
	}
	public static void main(String[]args) {
		practise_string somya=new practise_string();
		String s = somya.fullname("Somesh","Dnyanoba","Ghuge");
		System.out.println(" The fullname is "+s);
		
	}
	

}
