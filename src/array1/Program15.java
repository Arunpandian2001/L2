package dummy;

import java.util.Arrays;

public class Program15 {

	public static void main(String[] args) {
		int nums[]= {7, 10, 4, 3, 20, 15};
		System.out.println(kThSmallesAndNThlargest(nums,3,2));
	}

	private static int kThSmallesAndNThlargest(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		
		return nums[i-1]+nums[nums.length-j];
		
		
		
		
	}
}
