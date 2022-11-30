package array1;

public class Program12 {

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		System.out.println(searchInsert(nums,5));
	}
	public static int searchInsert(int[] nums, int target) {
        
		int length=nums.length;
		for(int i=0;i<length;i++) {
			
			if(target<nums[i]) {
				return i;				
			}
		}
		return 0;
    }
}
