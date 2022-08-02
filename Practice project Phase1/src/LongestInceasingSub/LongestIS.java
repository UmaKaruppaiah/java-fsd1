package LongestInceasingSub;


public class LongestIS {
	

	public static void main(String[] args) {
		
		int a[]= {10,50,70,60,55,73,88,95,12,32};
		int b=a.length;
		System.out.println("Longest Increasing Subsequence"+longISub(b));
		}
	
	static int longISub(int a,int b) {
		int arr[]=new int[b];
		int i,j, max=0;
		for(i=0;i<b;i++) {
			arr[i]=1;
			for(i= 1; i < b; i++) {
				for (j = 0; j < i; j++) {
					if(a[i]>a[j] && arr[i]<arr[j] + 1) {
						a[i]=a[j]+1;
						for(i = 0; i < b; i++) {
							if(max<arr[i]) {
								max=arr[i];
								
							}
							return max;
						}
					}
				}
			}
		}
	}

}
