package array2;

import java.util.HashMap;
import java.util.Map;

public class Program9 {
	public static void main(String[] args) {
		int [] array= { 2 ,3, 6,2,2,1,6 };
		noOfDuplicates(array);
	}

	private static void noOfDuplicates(int[] array) {
		// TODO Auto-generated method stub
		Map<Integer,Integer>map=new HashMap<>();
		
		for(int i=0;i<array.length;i++) {
			int count=1;
			if(map.containsKey(array[i])) {
				count=map.get(array[i]);
				++count;
			}
			map.put(array[i], count);
		}
		for(Map.Entry<Integer, Integer> element:map.entrySet()) {
			System.out.println(element.getKey()+" - "+element.getValue());
		}
	}
	
}
