package Object_class;
// public string to string 
// it returns the string representation of these object
public class String_to_String {
	int x;
	@Override
	public  String toString() {
		return "Example[x="+x+"]";
		
	}
	public static void main(String [] args)throws CloneNotSupportedException{
		String_to_String example1=new String_to_String();
		example1.x=50;
		System.out.println("First Object data is ..."+example1);
		
	}

}
