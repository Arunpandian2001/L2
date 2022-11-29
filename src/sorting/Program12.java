package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program12 {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int N = arr.length, K = 6;
		sortABS(arr,N,K);
	}
	static void sortABS(int arr[], int n,int k)
    {
        // add your code here
		Map<Integer,Integer>map=new HashMap<>();
		
		for(int i=0;i<n;i++) {
			map.put(arr[i], Math.abs(k-arr[i]));
		}
		Set<Entry<Integer,Integer>> entrySet=map.entrySet();
		List<Entry<Integer,Integer>> entryList=new ArrayList<>(entrySet);
		
		Collections.sort(entryList, new Comparator<Entry<Integer,Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}			
		});
		entryList.forEach(s->System.out.print(s.getKey()+" "));
    }
}
