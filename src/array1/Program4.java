package array1;

public class Program4 {

	public static int findExtra(int a[], int b[], int n) {
        // add code here.
		for(int i=0;i<n-1;i++) {
			if(a[i]!=b[i]) {
				return i;
			}
		}
		return n-1;
    }
	public static void main(String[] args) {
		int A[] = {2,4,6,8,9};
		int B[] = {2,4,6,8};
		System.out.println(findExtra(A,B,A.length));;
	}
}
