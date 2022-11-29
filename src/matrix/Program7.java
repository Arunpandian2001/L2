package matrix;

import java.util.Arrays;

public class Program7 {

	public static void main(String[] args) {
		int [][] array= {{5, 2, 0, 7, 1},{3, 4, 2, 9, 14},{5, 1, 3, 5, 2},{	4, 2, 6, 2, 1},{0, 6, 3, 5, 1}};
		leftDiagonal(array);
	}
	static void leftDiagonal(int[][] array) {
		
		int innerLength=array[0].length,  length=array.length;
		
		int elements[]=getDiagonalElements(array,innerLength);
		
		elements=sortArray(elements,length,innerLength);
		
		System.out.println(Arrays.toString(elements));
		
		for(int i=0;i<innerLength;i++) {
			array[i][i]=elements[i];
		}
		
		printElements(array,length,innerLength);
		
	}
	private static void printElements(int[][] array, int length, int innerLength) {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++) {
			for(int j=0;j<innerLength;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static int[] sortArray(int[] elements, int length, int innerLength) {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++) {
			int index=i;
			
			for(int j=i+1;j<innerLength;j++) {
				if(elements[j]<elements[index]) {
					index=j;
				}
			}
			int temp=elements[i];
			elements[i]=elements[index];
			elements[index]=temp;
		}
		return elements;
	}
	private static int[] getDiagonalElements(int[][] array, int innerLength) {
		// TODO Auto-generated method stub
		int [] elements=new int[innerLength];
		for(int i=0;i<innerLength;i++) {
			elements[i]=array[i][i];
		}
		return elements;
	}
}
