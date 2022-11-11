package Interview_Programs;

// Array Pair Sum

public class Array_Pair_Sum {
	
	public static void main(String[] args) {
		
		int[] arr = { -40, -5, 1, 3, 6, 7, 8, 20};
		int sum = 15;	
		getPairsCount(arr, sum);
		
	}

	private static void getPairsCount(int[] arr, int sum) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			int summ=0;
			for(int j=i;j<arr.length;j++) {
				summ=arr[i]+arr[j];
				if(summ==sum) {
					System.out.println("Pairs-->"+arr[i]+" + "+arr[j]);
					count++;
				}
				
			}
		}
		System.out.println("Pairs are available--->"+count);
	
		
	}
}
