package string1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program4 {
	public static void main(String[] args) {
		System.out.println(CountWays("27"));
	}
	public static int CountWays(String str)
    {
		Map<Integer,Character> map=new HashMap<>();
		List<Integer> number=new ArrayList<>();
		int range=64;
		int count=0;
		for(int i=1;i<=26;i++) {
			map.put(i, (char)(range+i));
		}
		if(str.length()<=2 && !str.equals("00")) {
//			if(Integer.parseInt(str)>26) {
//				for(int i=0;i<str.length()-1;i++) {
//					number.add(Integer.parseInt(str.substring(i,i+1)));
//					number.add(Integer.parseInt(str.substring(i+1,i+2)));	
//					count++;
//			}
			return 1;
		}
		else {
			
			System.out.println("error");
		}
		return count;        
    }
}
