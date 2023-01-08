package Interview_Programs;

public class Star_Trangle {
	public static void main(String[]args) {
		for(int i=0;i<=8;i++) {
			for(int j=8;j>i;j--) {
				System.out.print(" ");
			}
			for(int m=1;m<=(i*2)-1;m++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
	
	


