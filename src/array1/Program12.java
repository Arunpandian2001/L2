package dummy;

public class Program12 {

	 public static int searchInsert(int[] nums, int target) {
	       int length=nums.length;
	        for(int i=0;i<length;i++){
	             if((i==0 && target<nums[i])){
	                return i;
	             }
	             
	             if((i==length-1 && target>nums[i]) || (nums[i]<target && nums[i+1]>=target)){
	                 return i+1;
	             }
	        }
	      return 0;
	    }
	 public static void main(String[] args) {
		 int[] nums= {1,3,5,6};
		System.out.println(searchInsert(nums, 7));
	}
}
