package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program9 {

	public static void main(String[] args) {
		int A[] = {7,9,6,8,5,7,5,9,5,8,1};
		System.out.println(sortByFreq(A,A.length));
	}
	static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        // add your code here
		ArrayList<Integer>list=new ArrayList<>();
		Map<Integer,Integer> map=new HashMap<>();
		int value=0;
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				 value=map.get(arr[i]);
			}
			map.put(arr[i], ++value);
			value=0;
		}
		
		Set<Entry<Integer,Integer>> entrySet=map.entrySet();
		List<Entry<Integer,Integer>> entryList=new ArrayList<>(entrySet);
		
		Collections.sort(entryList, new Comparator<Entry<Integer,Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}			
		});
		
		entryList.forEach(s->{
			for(int i=0;i<s.getValue();i++) {
				list.add(s.getKey());
			}
		});
		
		return list;
    }
}
