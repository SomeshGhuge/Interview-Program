package Interview_Programs;


//input---> {1,2,3}
//k=3
//output--->2
//by using ARRAY AND SUBARRAY
public class sum_array_subarray {
	public static void main(String[]args) {
		int a[]= {1,2,3,4,5,6};
		int result=0;
		int k=6;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++) {
				sum=sum+a[i];
				if(sum==k) {
					result++;
				}
			}
		}
		System.out.println("Your result is-->"+result);
	}
}
