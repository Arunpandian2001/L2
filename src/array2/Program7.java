package array2;

import java.util.Arrays;

public class Program7 {

	public static void main(String[] args) {
		int [] num= {1,4,3,5,2};
		rotateArray(num,num.length);
	}

	private static void rotateArray(int[] num, int length) {
		// TODO Auto-generated method stub
		if(num.length==length) {
			Arrays.toString(num);
		}
	}
}
