/*
 * Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

 

Example 1:

Input:
N = 6
Output:
1 
Explanation:
Factors of 6 are 1, 2, 3 and 6.
Excluding 6 their sum is 6 which
is equal to N itself. So, it's a
Perfect Number.
 */

package mathematicalproblems;

public class Program8 {

	public static void main(String[] args) {
		int number=6;
		System.out.println(isNumberPerfect(number));
	}

	private static int isNumberPerfect(int number) {
		// TODO Auto-generated method stub
		int factorsSum=getSumOfFactors(number);
		if(factorsSum!=0)
			return 1;
		return 0;
	}

	private static int getSumOfFactors(int number) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<number;i++) {
			if(number%i==0)
				count+=i;
		}
		if(count==number)
			return 1;
		
		return 0;
	}
}
