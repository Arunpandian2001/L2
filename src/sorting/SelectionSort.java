package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = {10, 19, 6, 3, 5};
		sort(nums);
	}

	private static void sort(int[] nums) {
		// TODO Auto-generated method stub
		int length=nums.length;
		for(int i=0;i<length;i++) {
			int index=i;
			
			for(int j=i+1;j<length;j++) {
				
				if(nums[j]<nums[index]) {
					index=j;
				}
			}
			int temp=nums[index];
			nums[index]=nums[i];
			nums[i]=temp;
		}
		
		for(int i=0;i<length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
