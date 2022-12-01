/*
 * Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).

 

Example 1:

Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect 
square, floor of square_root of 5 is 2.
Example 2:

Input:
x = 4
Output: 2
Explanation: Since, 4 is a perfect 
square, so its square root is 2.
 */


package mathematicalproblems;

public class Program2 {

	public static void main(String[] args) {
		System.out.println(findSqRoot(16));
	}

	private static long findSqRoot(int number) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<Integer.MAX_VALUE;i++) {
			if((i*i)>number) {
				return i-1;
			}
			if((i*i)==number)
				return i;
		}
		return 0;
	}
}
