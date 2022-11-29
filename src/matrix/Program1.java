package matrix;

public class Program1 {

	public static void main(String[] args) {
		int[][] array={{1,0,1},
		 {-8,9,-2}};
		System.out.println(sumOfMatrix(2,3,array));
	}
	static int sumOfMatrix(int N, int M, int[][] grid) {
        // code here
		int sum=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				sum+=grid[i][j];
			}
		}
		return sum;
    }
}
