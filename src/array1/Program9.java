package array1;

public class Program9 {

	public static void main(String[] args) {
		int[] nums= {1,2,3};
		System.out.println(findPeakElement(nums));
	}
	public static int findPeakElement(int[] nums) {
        int peak=0;
        int length=nums.length;
        if(length==0)
        	return 0;
        if(length==2) {
        	if(nums[0]<nums[1]) {
        		return 1;
        	}
        }
        for(int i=1;i<length;i++) {
        	peak=nums[i];
        	if(i==length-1) {
        		if(nums[i]>nums[i-1]) {
        			return i;
        		}
        	}
        	if(peak>nums[i-1] && peak>nums[i+1]) {
        		return i;
        	}
        }
		return 0;
    }
}
