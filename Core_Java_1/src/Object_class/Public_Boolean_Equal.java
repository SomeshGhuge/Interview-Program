package Object_class;

public class Public_Boolean_Equal {
	 int ID;
	 String str;
	 public static void main(String []args) {
		 Public_Boolean_Equal asdf = new Public_Boolean_Equal();
		asdf.ID=1;
		asdf.str="Str";
		 Public_Boolean_Equal asdf1 = new Public_Boolean_Equal();
		 asdf1.ID=2;
		 asdf1.str="str2";
		 
		 
		 System.out.println(asdf.equals(asdf1));
		 // The ans is false because either in same class 
		 // we creat a two object so the value is stored
		 // in two diff locations so it is not equals to each other.

	 }

}
