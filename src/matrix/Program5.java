package matrix;

public class Program5 {
	public static void main(String[] args) {
		int arr[ ][ ] = { {0, 1, 1, 1},	{0, 0, 1, 1},{1, 1, 1, 1},{0, 0, 0, 0} } ,N=arr.length,M=arr[0].length;
		maxNumberOf1(N,M,arr);
	}
	static void maxNumberOf1(int n, int m, int[][] arr) {
		int index=findIndex(n,m,arr);
		
		for(int i=0;i<m;i++) {
			arr[index][i]=0;
		}
		printArray(n,m,arr);
	}
	private static void printArray(int n, int m, int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	private static int findIndex(int n, int m, int[][] arr) {
		// TODO Auto-generated method stub
		int count=0,index=0;
		for(int i=0;i<n;i++) {
			int temp=0;
			for(int j=0;j<m;j++) {
				if(arr[i][j]==1)
					temp++;
			}
			if(temp>count) {
				count=temp;
				index=i;
			}
		}
		return index;
	}
}
