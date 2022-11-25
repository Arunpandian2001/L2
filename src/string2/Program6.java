package string2;

import java.util.ArrayList;
import java.util.List;

public class Program6 {

	static String modify (String s)
    {
        // your code here
		int length=s.length();
		char[] givenString=s.toCharArray();
		List<Character> vowels=new ArrayList<>();
		List<Integer> indexes=new ArrayList<>();
		StringBuilder builder=new StringBuilder();
		vowels.add('a');vowels.add('e');vowels.add('i');vowels.add('o');vowels.add('u');
		int count=0;
		for(int i=0;i<length;i++) {
			if(vowels.contains(givenString[i])) {
				count++;
				indexes.add(i);
				builder.append(givenString[i]);
			}
		}
		if(count==0) {
			return s;
		}
		
		char[] reverse=builder.reverse().toString().toCharArray();
		int j=0;
		int temp=builder.length();
		for(int i=0;i<temp;i++) {
			givenString[indexes.get(i)]=reverse[i];
		}
		return String.valueOf(givenString);
    }
	public static void main(String[] args) {
		System.out.println(modify ("arunai"));
	}
}
