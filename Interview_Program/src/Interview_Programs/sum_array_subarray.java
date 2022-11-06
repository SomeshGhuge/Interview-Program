package Interview_Programs;


//input---> {1,2,3}
//k=3
//output--->2
//by using ARRAY AND SUBARRAY
public class sum_array_subarray {
	
	public static void main(String[]args) {
		int array[]= {1,2,3,4,5};
		int record=0;
		int k=3;
		
		for(int i=0;i<array.length;i++) {
			int sum=0;
			for(int j=i;j<array.length;j++) {
				sum=sum+array[j];
				if(sum==k) {
					record++;
				}
			}
			
		}
		System.out.println("Your ans is ---->"+record);
	}

}
