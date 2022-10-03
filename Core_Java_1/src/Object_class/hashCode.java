package Object_class;
//2) public hashCode()
public class hashCode {
	public static void main(String []args) {
		hashCode a=new hashCode();
		hashCode a1=new hashCode();
		System.out.println("hashcode value is "+a.hashCode());
		System.out.println("hashcode value is "+a1.hashCode());

	}
// in output we get diff value beacuse every hashcode has diff value either ther class is same.
//	Note- if two objects are equal, their hashcode will be same.
//	If two object hashcode are same, you cannot guaranty that objects are equal. 
//	these return integer or  into 4 byte memory.
//	for every object hash code value is change.
//	every object is store into a specific value called as hashcode.
	

}
