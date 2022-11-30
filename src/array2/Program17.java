package array2;

import java.util.Arrays;

public class Program17 {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		rotateArray(array,array.length,2);
	}

	private static void rotateArray(int[] array, int length, int position) {
		// TODO Auto-generated method stub
		for(int i=0;i<position;i++) {
			int temp=array[0];
			for(int j=1;j<length;j++) {
				array[j-1]=array[j];
			}
			array[length-1]=temp;
		}
		System.out.println(Arrays.toString(array));
	}
	
}
