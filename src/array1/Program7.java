package array1;

import java.util.HashSet;
import java.util.Set;

public class Program7 {

	static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++) {
			int temp=x-arr[i];
			if(set.contains(temp)) {
				return true;
			}
			set.add(arr[i]);
		}
		return false;
    }
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 10, 8};
		System.out.println(hasArrayTwoCandidates( arr,  arr.length, 16 ));
	}
}
