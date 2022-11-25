package array1;

public class Program1 {
	static int celebrity(int M[][], int n)
    {
    	// code here 
		int a=0;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(M[i][j]==0) {
					count++;
				}
			}
			if(count==n)
				a=i;
		}
		for(int i=0;i<n;i++) {
			if(i==a)
				continue;
			if(M[i][a]!=1) {
				return -1;
			}
		}
		return a;
    }
	
	public static void main(String[] args) {
		
		int M[][] = {{0 ,1 ,0},{0, 0, 0}, {0, 1, 0}};
		System.out.println(celebrity(M,3));
	}
}
