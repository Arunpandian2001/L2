package dummy;



public class Program13 {

	public static int[] maxSlidingWindow(int[] nums, int k) {
        int length=nums.length;
        int [] array=new int[length-k+1];
        
        for(int i=0;i<=length-k;i++) {
        	int max=Integer.MIN_VALUE;
        	for(int j=i;j<k+i;j++) {
        		if(max<nums[j]) {
        			max=nums[j];
        		}
        	}
        	array[i]=max;
        }
        
		return array;
    }
	public static void main(String[] args) {
		int[] nums= {1,3,-1,-3,5,3,6,7};
		System.out.println(maxSlidingWindow(nums, 3));
	}
}
