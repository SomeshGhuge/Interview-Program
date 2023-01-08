package Interview_Programs;

// Array Pair Sum

public class Array_Pair_Sum {
	public static void main(String[]args) {
		
	int a[]= {40,20,30,50,80,60,10,25};
	int sum=50;
	getSumPair(a,sum);
	}
	
	static int getSumPair(int a[],int sum) {
		int count=0;
		for(int b=0;b<a.length;b++) {
			int summ=0;
			for(int j=b;j<a.length;j++) {
				summ=a[b]+a[j];
				if(sum==summ) {
					count++;
					
				}
			}
		}
		
		System.out.println("sum of pair  50 Count is --->"+count);
		return count;
		
	}
}

