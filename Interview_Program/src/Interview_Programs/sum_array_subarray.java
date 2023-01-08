package Interview_Programs;


//input---> {1,2,3}
//k=3
//output--->2
//by using ARRAY AND SUBARRAY
public class sum_array_subarray {
	public static void main(String[]args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int  value=6;
		int count=0;
		for(int i=0;i<a.length;i++) {
			int summ=0;
			for(int j=i;j<a.length;j++) {
				summ=a[i]+a[j];
				if(summ==value) { 
					count++;
				}
			}
		}
		System.out.println(count);
	}
}

