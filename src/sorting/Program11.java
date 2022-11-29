package sorting;

import java.util.Arrays;

public class Program11 {

	public static void main(String[] args) {
		long A[] = {1,2,5,4,0};
		long array2[] = {2,4,5,0,2};
		System.out.println(check(A,array2,5));
	}
	public static boolean check(long[] A,long[] B,int N)
    {
        //Your code here
		
		long[] temp=Arrays.copyOf(B, N);
		Arrays.sort(A);
		Arrays.sort(temp);
		for(int i=0;i<N;i++){
			if(temp[i]!=A[i])
				return false;
		}
		return true;
    }
}
