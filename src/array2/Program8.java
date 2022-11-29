package array2;

import java.util.ArrayList;
import java.util.List;

public class Program8 {

	public static void main(String[] args) {
		Integer[] a= {1, 2, 5, 3, 8, 9};
		Integer[] b= {1,  7, 5, 8, 8};
		unionIntersection(a,b);
	
	}

	private static void unionIntersection(Integer[] a, Integer[] b) {
		// TODO Auto-generated method stub
		int length1=a.length;
		int length2=b.length;
		List<Integer> union=new ArrayList<>();
		List<Integer> except=new ArrayList<>();
		List<Integer> intersection=new ArrayList<>();
		
		for(int i=0;i<length1;i++) {
			if(!union.contains(a[i])) {
				union.add(a[i]);
			}else if(!intersection.contains(a[i])) {
				intersection.add(a[i]);
			}
		}
		for(int i=0;i<length2;i++) {
			if(!union.contains(b[i])) {
				union.add(b[i]);
			}else if(!intersection.contains(b[i])) {
				intersection.add(b[i]);
			}
		}

		
		for(int i=0;i<length1;i++) {
			if(!except.contains(a[i]) && a[i]%2==0) {
				except.add(a[i]);
			}
		}
		
		for(int i=0;i<length2;i++) {
			if(!except.contains(b[i]) && b[i]%2!=0) {
				except.add(b[i]);
			}
		}

		System.out.println("UNION :"+union);
		System.out.println("EXCEPT :"+except);
		System.out.println("INTERSECTION :"+intersection);

	}
}
