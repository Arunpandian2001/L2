package string2;

import java.util.HashMap;
import java.util.Map;

public class Program9 {

	public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
		int length1=str1.length();
		int length2=str2.length();
		if(length1!=length2) {
			return false;
		}
		Map<Character,Character> map1=new HashMap<>();
		Map<Character,Character> map2=new HashMap<>();
		for(int i=0;i<length1;i++) {
			char character1=str1.charAt(i);
			char character2=str2.charAt(i);
			map1.put(character1, character2);
			map2.put(character2, character1);
		}
		for(int i=0;i<length1;i++) {
			char character1=str1.charAt(i);
			char character2=str2.charAt(i);
			if(map1.get(character1)!=character2 || map2.get(character2)!=character1) {
				return false;
			}
		}
		return true;
    }
	public static void main(String[] args) {
		System.out.println(areIsomorphic("aab" ,"xxy" ));
	}
}
