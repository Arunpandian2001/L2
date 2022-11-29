package dummy;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("size:");
		int size=scanner.nextInt();
		System.out.println("Elemenets");
		int [] nums=new int[size];
		for(int i=0;i<size;i++) {
			nums[i]=scanner.nextInt();
		}
		localMinima(nums);
		scanner.close();
	}

	private static void localMinima(int[] nums) {
		// TODO Auto-generated method stub
		for(int i=1;i<nums.length;i++) {
			if(i==nums.length-1 && nums[i]<=nums[i-1]) {
				System.out.print(nums[i]+" ");
				continue;
			}
			if(nums[i-1]>=nums[i] && nums[i+1]>=nums[i]) {
				System.out.print(nums[i]+" ");
			}
		}
	}
}
