package sorting;

public class Program6 {

	public static void main(String[] args) {
		int[] nums = {2, 8, 5, 4};
		System.out.println(minSwaps(nums));
	}
	public static int minSwaps(int nums[])
    {
        // Code here
		int length=nums.length;
		int count=-2;
		for(int i=0;i<length-1;i++) {
			int index=i;
			
			for(int j=i+1;j<length;j++) {
				if(nums[j]<nums[index]) {
					index=j;
					count++;
				}
			}
			int temp=nums[i];
			nums[i]=nums[index];
			nums[index]=temp;
		}
		return count;
    }
}
