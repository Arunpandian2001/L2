package array1;

import java.util.Arrays;

public class Program2 {

	 static int remove_duplicate(int A[],int N){
       
		 int j=0;
		 for(int i=0;i<N-1;i++) {
			 if(A[i]!=A[i+1]) {
				 A[j]=A[i];
				 j++;
			 }
		 }
		 A[j]=A[N-1];
		 j++;
		 System.out.println(Arrays.toString(A));
		 System.out.println(j);
        return j;
    }
	public static void main(String[] args) {
		int []A= {1,1,2,2,3,3,4,4,5,5};
		remove_duplicate(A,A.length);
	}
	
}
