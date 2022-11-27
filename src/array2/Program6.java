package array2;

import java.util.HashMap;
import java.util.Map;

public class Program6 {

	public static void main(String[] args) {
		int num[]= {0, 14, 0, 4, 7, 8, 3, 5, 7};
		int sum=11;
		findPairs(sum,num);
	}

	private static void findPairs(int sum, int[] num) {
		// TODO Auto-generated method stub
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<num.length-1;i++) {
			if(num[i]+num[i+1]==sum) {
				map.put(num[i], num[i+1]);
			}
		}
		for(Map.Entry<Integer, Integer>element:map.entrySet()) {
			System.out.println(element.getKey()+","+element.getValue());
		}
	}
}
