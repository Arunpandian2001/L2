package dummy;

import java.util.Arrays;

public class Program17 {

	public static void main(String[] args) {
		int[] nums = {2,2,1,1};
		System.out.println(singleAppearingElement(nums));
	}

	private static int singleAppearingElement(int... nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i=i+2) {
			if(nums[i]!=nums[i+1]) {
				return nums[i];
			}
		}
		return 0;
	}
}
