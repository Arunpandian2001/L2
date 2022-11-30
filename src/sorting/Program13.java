package sorting;

public class Program13 {

	public static void main(String[] args) {
		int [] array={10, 20, 30, 40, 50};
		System.out.println(arraySortedOrNot(array,array.length));
	}
	static boolean arraySortedOrNot(int[] arr, int n) {
		// code here
		for(int i=0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
				return false;
			} 
		}
		return true;
	}
}
