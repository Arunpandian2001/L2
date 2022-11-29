package array2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program11 {

	public static void main(String[] args) {
		String[][] family= {
				{"Ram", "Syam"},
				{"Akil", "Syam"},
				{"Nikil", "Ram"},
				{"Subhash", "Ram"},
				{"Karthik", "Akil"}
				};
		System.out.println(familyTree("Syam",2,family));
	}
	static int familyTree(String name, int level, String[][] family) {
		
		Map<String,String> map=new HashMap<>();
		List<String>list=new ArrayList<>();
		list.add(name);
		int count=0;
		for(String[] array:family) {
			for(int i=0;i<array.length;i=i+2) {
				map.put(array[i], array[i+1]);
			}
		}
		
		for(int i=0;i<level;i++) {
			for(Map.Entry<String, String> element:map.entrySet()) {
				
			}
		}
		return 0;
	}
}
