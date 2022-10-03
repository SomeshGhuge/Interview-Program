package Static_variable_method;

public class how_to_access_static_members_from_Non_static_member {
	
	void somya() {
		System.out.println("I love Shital");
		myawu();
	}
	static void myawu() {
		System.out.println("I love Somesh");
	}
	public static void main(String[]args) {
	how_to_access_static_members_from_Non_static_member asdf= new how_to_access_static_members_from_Non_static_member();
	asdf.somya();	
		
	}

}
