package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program7 {
	public static void main(String[] args) {
		int n = 2,m = 8;
		long arr1[] = {12, 42} , arr2[] = {3, 4, 5, 28, 37, 42, 43, 46};
		merge(arr1,arr2,n,m);
	}
	private static int index=0;
	 public static void merge(long arr1[], long arr2[], int n, int m) 
	    {
	        // code here 
	        List<Long> list=new ArrayList<>();
	        list=addOnList(n,arr1,list);
	        list=addOnList(m,arr2,list);
	        Collections.sort(list);
	        arr1=getModifiedArray(n,arr1,list);
	        arr2=getModifiedArray(m,arr2,list);

    }
	private static long[] getModifiedArray(int n, long[] arr, List<Long> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
        	arr[i]=list.get(index);
        	index++;
        }
		return arr;
	}
	private static List<Long> addOnList(int n, long[] arr, List<Long> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
        	list.add(arr[i]);
        }
		return list;
	}
}

