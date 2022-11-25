package string2;

import java.util.HashMap;
import java.util.Map;

public class Program3 {

	public static int romanToInt(String s) {
        Map<Character,Integer>map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        
        char []array=s.toCharArray();
        int length=array.length;
        int sum=0;
        for(int i=0;i<length;i++) {
        	if(i!=length-1 &&  (map.get(array[i])<map.get(array[i+1]))) {
        		sum+=map.get(array[i+1])-map.get(array[i]);
        		i++;
        	}else {
        		sum+=map.get(array[i]);
        	}
        }
		return sum;
    }
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}
}
