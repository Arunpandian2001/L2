package array2;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		int [] nums = {3, 4, 1, 9, 56, 7, 9, 12,2,2};
		int students=5;
		int length=nums.length;
		System.out.println(minimumNoOfChocolates(students,length,nums));
	}

	private static int minimumNoOfChocolates(int students, int length, int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int startIndex=0;
		int difference=Integer.MAX_VALUE;
		for(int i=0;i<students-1;i++) {
			int temp=nums[i+students-1]-nums[i];
			if((difference>temp)) {
				difference=temp;
				startIndex=i;
			}
		}
		
		int[] answer=new int[students];
		for(int i=0;i<students;i++) {
			answer[i]=nums[startIndex];
			startIndex++;
		}
		return difference;
	}
}
