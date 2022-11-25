package array1;

public class Program10 {

	public static void main(String[] args) {
		int[] nums= {2,3,1,1,4};
		System.out.println(jump(nums));
	}
	public static int jump(int[] nums) {
		int len = nums.length - 1, curr = -1, next = 0, ans = 0;
        for (int i = 0; next < len; i++) {
            if (i > curr) {
                ans++;
                curr = next;
            }
            next = Math.max(next, nums[i] + i);
        }
        return ans;
    }

}
