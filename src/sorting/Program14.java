package sorting;

public class Program14 {

	public static void main(String[] args) {
		int arr[] = {-8, -66, -60},N = arr.length;
		System.out.println(closestToZero(arr,N));
	}
	public static int closestToZero (int arr[], int n)
    {
        // your code here
		 for(int i = 1; i < n; i++)
		    {
		        if (!(Math.abs(arr[i - 1]) <
		              Math.abs(arr[i])))
		        {
		            int temp = arr[i - 1];
		            arr[i - 1] = arr[i];
		            arr[i] = temp;
		        }
		    }
		 int min=Integer.MAX_VALUE,x=0,y=0;
		 
		 for(int i=1;i<n;i++) {
			 if(Math.abs(arr[i-1])+Math.abs(arr[i]) <=min) {
				 min=Math.abs(arr[i-1])+Math.abs(arr[i]);
				 x=i-1;
				 y=i;
			 }
		 }
		return arr[x]+arr[y];
    }
}
