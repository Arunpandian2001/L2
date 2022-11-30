package array2;

public class Program12 {

	public static void main(String[] args) {
		int [] arr= {10, 5, 7};
		
		System.out.println(isArrayModifiable(arr,arr.length));
	}
	static boolean isArrayModifiable(int[] arr, int length) {
		int count=0;
		for(int i=0;i<length-1;i++) {
			if(arr[i]>arr[i+1]) {
				count++;
			}
		}
		if(count>1) {
			return false;
		}
		return true;
	}
}
