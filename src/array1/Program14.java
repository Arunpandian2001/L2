package dummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program14 {

	public static void main(String[] args) {
		int[] nums= {131, 11, 48};
		System.out.println(common_digits(nums));
	}
	public static int[] common_digits(int[] nums)
    {
        // code here
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			int number=nums[i];
			int remainder=0;
			while(number>0) {
				remainder=number%10;
				number=number/10;
				if(!list.contains(remainder)) {
					list.add(remainder);
				}
			}
		}
		Collections.sort(list);
		int [] array=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			array[i]=list.get(i);
		}
        return array;
    }
}
