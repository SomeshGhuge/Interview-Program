package Interview_Programs;

public class reverse_rigth_Trangle_from_end {
	public static void main(String[]args) {
		System.out.println("Reverse rigtht trangle-->End start");
		for(int i=0;i<5;i++) {
			for(int j=5-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int m=0;m<i;m++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
