/*
 * Consider a long alley with a N number of doors on one side. All the doors are closed initially. You move to and fro in the alley changing the states of the doors as follows: you open a door that is already closed and you close a door that is already opened. You start at one end go on altering the state of the doors till you reach the other end and then you come back and start altering the states of the doors again.
In the first go, you alter the states of doors numbered 1, 2, 3, , n.
In the second go, you alter the states of doors numbered 2, 4, 6
In the third go, you alter the states of doors numbered 3, 6, 9
You continue this till the Nth go in which you alter the state of the door numbered N.
You have to find the number of open doors at the end of the procedure.

 

Example 1:

Input:
N = 2
Output:
1
Explanation:
Initially all doors are closed.
After 1st go, all doors will be opened.
After 2nd go second door will be closed.
So, Only 1st door will remain Open.

 */


package mathematicalproblems;

public class Program7 {

	public static void main(String[] args) {
		
		int number=3;
		
		System.out.println(noOfDoorsOpened(number));
	}

	private static int noOfDoorsOpened(int number) {
		// TODO Auto-generated method stub
		return (int)Math.sqrt(number);
	}
	
}
