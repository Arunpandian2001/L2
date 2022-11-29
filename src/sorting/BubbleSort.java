package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = {2, 8, 5, 4};
		sort(nums);
	}

	private static void sort(int[] nums) {
		// TODO Auto-generated method stub
		int length=nums.length;
		for(int i=0;i<length-1;i++) {
			for(int j=i+1;j<length;j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		
		for(int i=0;i<length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
}
