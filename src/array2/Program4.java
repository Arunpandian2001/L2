package array2;

public class Program4 {

	public static void main(String[] args) {
		int A[] = {1, 2, 3, 4, 5};
		int N=5;
		rotateClockWise(A,N,1);
	}

	private static void rotateClockWise(int[] a, int n,int rotation) {
		// TODO Auto-generated method stub
		int length=a.length;
		int [] temp=new int[length];
		int j=0;
		for(int i=rotation;i<length;i++) {
			temp[j]=a[i];
			j++;
		}
		for(int i=0;i<rotation;i++) {
			temp[j]=a[i];
			j++;
		}
		for(int i=0;i<n;i++) {
			a[i]=temp[i];
			System.out.print(a[i]+" ");
		}
	}
}
