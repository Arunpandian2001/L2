package sorting;

import java.util.Arrays;

public class Program15 {

	public static void main(String[] args) {
		int arr[] = {1, 12, 5, 111, 200, 1000, 10};
		int k=50;
		int n=arr.length;
		System.out.println(toyCount(n,k,arr));
	}
	static int toyCount(int N, int K, int arr[])
    {
        // code here
		 int sum=0;
			int count=0;
			boolean flag=true;
			Arrays.sort(arr);
			for(int i=0;i<N && flag;i++) {
				sum+=arr[i];
				if(sum<=K && arr[i]<=K) {
					count++;
				}else{
				    flag=false;
				}
			}
			
			return count;
    }
}
