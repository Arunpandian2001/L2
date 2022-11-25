package array1;

import java.util.HashSet;
import java.util.Set;

public class Program6 {

	public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(a[i]);
		}
		for(int i=0;i<m;i++) {
			set.add(b[i]);
		}
		return set.size();
    }
	public static void main(String[] args) {
		int [] a= {1, 2, 3, 4, 5};
		int [] b= {1, 2, 3};
		System.out.println(doUnion(a,a.length, b,b.length));
	}
}
