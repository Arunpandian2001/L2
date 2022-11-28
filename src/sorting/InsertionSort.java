package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] nums = {2, 8, 5, 4};
		sort(nums);
	}

	private static void sort(int[] nums) {
		// TODO Auto-generated method stub
		int length=nums.length;
		for(int i=1;i<length;i++) {
			int key=nums[i];
			int j=i-1;
			
			while(j>-1 && (nums[j]>key)) {
				nums[j+1]=nums[j];
				j--;
			}
			nums[j+1]=key;
		}
		
		for(int i=0;i<length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
