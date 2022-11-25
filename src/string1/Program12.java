package string1;

import java.util.HashMap;
import java.util.Map;

public class Program12 {

	static String restoreString(String s, int[] indices) {
		String string=s.replaceAll("\\s","");
		String answer="";
		Map<Integer,Character>map=new HashMap<>();
		
		for(int i=0;i<string.length();i++) {
        	map.put(indices[i], s.charAt(i));
		}
        for(int i=0;i<string.length();i++) {
        	int temp=0;
        	for(int j=1;j<(string.length()-i);j++) {
        		if(indices[j-1]>indices[j]) {
        			temp=indices[j-1];
        			indices[j-1]=indices[j];
        			indices[j]=temp;        			
        		}
        	}
        	answer+=map.get(i);
        }
		return answer;
    }
	public static void main(String[] args) {
		int[] indices= {4,5,6,7,0,2,1,3};
		System.out.println(restoreString("codeleet",indices));
	}
}
