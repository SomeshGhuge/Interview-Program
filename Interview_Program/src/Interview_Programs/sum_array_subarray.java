package Interview_Programs;


//input---> {1,2,3}
//k=3
//output--->2
//by using ARRAY AND SUBARRAY
public class sum_array_subarray {
public static void main(String[] args) {
	int a[]= {1,2,3};
	int result=0;
	int k=2;
	for(int i=0;i<a.length;i++) {
		int sum = 0;
		for(int j=i;j<a.length;j++) {
			sum=sum+a[j];
			
			if(sum==k) {
				result++;
			}
		}
	}
	System.out.println("no of subarrays having sum "+k+" is "+result);
}

}
