package sorting;

public class Program13 {

	public static void main(String[] args) {
		int [] array={10, 20, 30, 40, 50};
		System.out.println(arraySortedOrNot(array,array.length));
	}
	static boolean arraySortedOrNot(int[] arr, int n) {
		// code here
<<<<<<< HEAD
		for(int i=0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
=======
		for(int i=0;i<n/2;i++){
			if(arr[i]>arr[n-1-i] || arr[i]>arr[i+1]){
>>>>>>> a138e34b62c1121e356f97daa8b3d88c922b39f0
				return false;
			} 
		}
		return true;
	}
}
