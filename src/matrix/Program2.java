package matrix;

public class Program2 {

	public static void main(String[] args) {
		int matrix[][] = {{1 ,2 ,3},{4, 5, 6},{7, 8, 9}};
		int length=matrix.length;
		rotateArray(matrix,length);
	}

	private static void rotateArray(int[][] matrix, int length) {
		// TODO Auto-generated method stub
		int[][]copy=getCopy(matrix,length);
		
		int j=length-1;
		for(int a=0;a<length;a++,j--) {
			for(int i=0;i<length;i++) {
				int temp=matrix[a][i];
				matrix[a][i]=copy[i][j];
				copy[i][j]=temp;
			}
		}
		printArray(matrix,length);
		
	}

	private static void printArray(int[][] matrix, int length) {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++) {
			for(int k=0;k<length;k++) {
				System.out.print(matrix[i][k]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] getCopy(int[][] matrix, int length) {
		// TODO Auto-generated method stub
		int copy[][]=new int [length][length];
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				copy[i][j]=matrix[i][j];
			}
		}
		return copy;
	}
}
