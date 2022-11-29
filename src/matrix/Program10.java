package matrix;

public class Program10 {

	public static void main(String[] args) {
<<<<<<< HEAD
		int [][] mat = {{11, 14},{ 14 ,6},{ 8, 20},{ 3, 20 },{9, 2}, {2, 8}};
		System.out.println(isSuperSimilar(mat.length,mat[0].length,mat,3));
	}
	static int isSuperSimilar(int n, int m, int mat[][], int x)
	{
		// code here
		if(m==x) {
			return 1;
		}
		int[][] array=new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				array[i][j]=mat[i][j];
			}
		}
		
		for(int i=0;i<x;i++) {
			
			for(int j=0;j<n;j++) {
				if(j%2==0) {
					int start=mat[j][0],k;
					for( k=1;k<m;k++) {
						mat[j][k-1]=mat[j][k];
					}
					mat[j][k-1]=start;
				}else {
					int start=mat[j][m-1],k;	
					for( k=0;k<m-1;k++) {
						mat[j][k+1]=mat[j][k];
					}
					mat[j][0]=start;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(array[i][j]!=mat[i][j]) {
					return 0;
=======
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
>>>>>>> a138e34b62c1121e356f97daa8b3d88c922b39f0
				}
			}
		}
		return 1;
<<<<<<< HEAD

	}
=======
		
    }
>>>>>>> a138e34b62c1121e356f97daa8b3d88c922b39f0
}
