package mathematicalproblems;

public class Program1 {

	public static void main(String[] args) {
		System.out.println(numberOfPaths(2,8));
	}
	static long numberOfPaths(int m, int n) {
        // Code Here
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(m==1 || n==1)
					return 1;
			}
		}
		return numberOfPaths(m-1,n)+numberOfPaths(m,n-1);
    }

}
