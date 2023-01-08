package Interview_Programs;

public class Star_Reverse_Rigth_Trangle {
	public static void main(String[]args) {
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
