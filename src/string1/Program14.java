package string1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program14 {
	
	public static List<List<String>> Anagrams(String... string_list) {
		List <List<String>> list=new ArrayList<>();
		Map<String,List<String>>map=new HashMap<>();
		
		for(String element:string_list) {
			char[] array=element.toCharArray();
			Arrays.sort(array);
			String required=String.valueOf(array);
			if(map.containsKey(required)) {
				map.get(required).add(element);
				
			}else {
				List<String> innerList=new ArrayList<>();
				innerList.add(element);
				list.add(innerList);
				map.put(required, innerList);
			}
		}
		return list;
    }
	public static void main(String[] args) {
		System.out.println(Anagrams("act","god","cat","dog","tac"));
	}
}
