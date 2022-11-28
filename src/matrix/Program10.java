package matrix;

public class Program10 {

	public static void main(String[] args) {
		int [][] mat = {{12,10}};
		System.out.println(isSuperSimilar(2,22,mat,18));
	}
	static int isSuperSimilar(int n, int m, int mat[][], int x)
    {
        // code here
		int [][] array=new int[n][m];
		if(x%2!=0) {
			for(int i=0;i<x;i++) {
				for(int j=0;j<n;j++) {
					for(int k=0;k<m;k=k+2) {
						if(m%2==0) {
							array[j][k]=mat[j][k+1];
							array[j][k+1]=mat[j][k];
							continue;
						}
						array[j][k]=mat[j][k];
					}
				}
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(array[i][j]!=mat[i][j]) {
						return 0;
					}
				}
			}
		}
		return 1;
		
    }
}
