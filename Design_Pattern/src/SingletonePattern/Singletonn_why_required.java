package SingletonePattern;
public class Singletonn_why_required {

	private static Singletonn_why_required s;
	
	private static Singletonn_why_required test() {
		s=new Singletonn_why_required();
		return s;
	}
	
	public static void main(String[]args) {
		System.out.println( "First instance--->"+Singletonn_why_required.test().hashCode());
		System.out.println( "Second instance--->"+Singletonn_why_required.test().hashCode());
		System.out.println( "Third instance--->"+Singletonn_why_required.test().hashCode());
		
		
// In the above program, we have created the three instance of same
//   class but I want to create only one instance of class then
//      I should go for singleton design pattern. 
}
	
}
