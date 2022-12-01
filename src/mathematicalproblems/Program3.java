/*
 Given an integer N which has odd number of digits, find whether the given number is a balanced or not.

An odd digit number is called a balanced number if the sum of all digits to the left of the middle digit and the sum of all digits to the right of the middle digit is equal.

Example 1:

Input:
N = 1234006
Output: 1 
Explanation: Total number of digits in
N = 7. Middle digit is 4. LHS = 1+2+3 = 6
and RHS = 0+0+6 = 6. LHS is equal to RHS. 
 */


package mathematicalproblems;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("number:");
		int number=scanner.nextInt();
		System.out.println(isNumberBalanced(number+""));
		scanner.close();
	}

	private static boolean isNumberBalanced( String string) {
		// TODO Auto-generated method stub
		int length=string.length();
		if(length%2==0) {
			return false;
		}
		int firstSum=0,secondSum=0,index=0;
		for(int i=0;i<length/2;i++,index++) {
			firstSum+=(int)string.charAt(index)-48;//Integer.parseInt(String.valueOf(stirng.charAt(index)));
		}
		index++;
		for(int i=(length/2)+1;i<length;i++,index++) {
			secondSum+=(int)string.charAt(index)-48;
		}
		if(firstSum==secondSum)
			return true;
		
		return false;
	}
}
