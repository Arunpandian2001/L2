package array2;

import java.util.Arrays;

public class Program18 {

	public static void main(String[] args) {
		int array[]= {28, 985, 2 ,58, 1571, 3315 ,81, 68};
		orderBySumOfDigits(array,array.length);
	}

	private static void orderBySumOfDigits(int[] array, int length) {
		// TODO Auto-generated method stub
		for(int i=0;i<length-1;i++) {
			int index=i;
			int sum1=sumOfDigits(array[i]);
			for(int j=i+1;j<length;j++) {
				int sum2=sumOfDigits(array[j]);
				if(sum2<sum1) {
					sum1=sum2;
					index=j;
				}
			}
			int temp=array[index];
			array[index]=array[i];
			array[i]=temp;
		}
		System.out.println(Arrays.toString(array));
	}
	static int sumOfDigits(int number) {
		int sum=0,rem=0;
		while(number>0) {
			rem=number%10;
			number=number/10;
			sum+=rem;
		}
		return sum;
	}
}
