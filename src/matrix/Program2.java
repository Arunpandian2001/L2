package matrix;

public class Program2 {

	public static void main(String[] args) {
		int matrix[][] = {{1, 2, 3},
		              {4 ,5, 6},
		              {7, 8, 9}};
		rotate(matrix);
	}
	static void rotate(int matrix[][]) 
    {
        // Code Here
		for(int i=2;i>=0;i--) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
    }
}
