package array2;

import java.util.ArrayList;
import java.util.List;

public class Program10 {

	public static void main(String[] args) {
		int array[]={1,5,2,3,4};
		System.out.println(longestIncreasingSubSequence(array));
	}
	private static int longestIncreasingSubSequence(int[] array) {
		// TODO Auto-generated method stub
		int length=array.length;
		List<Integer> list=new ArrayList<>();
		list.add(array[0]);
		for(int i=1;i<length;i++) {
			if(array[i-1]<array[i])
				list.add(array[i]);
		}
		return list.size();
	}
	
}
