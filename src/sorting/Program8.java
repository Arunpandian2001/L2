package sorting;


public class Program8 {
	public static void main(String[] args) {
		int[] array= {7, 10, 4, 3, 20, 15};
		int n=6,k=3;
		System.out.println(kthSmallest(array,n,k));
	}
	public static int kthSmallest(int[] arr, int n, int k) 
    { 
        //Your code here
		for(int j=1;j<n;j++) {
			int key=arr[j];
			int i=j-1;
			while(i>=0 && arr[i]>key) {
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
		return arr[k-1];
    } 
}
