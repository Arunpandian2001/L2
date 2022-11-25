package string1;

import java.util.ArrayList;
import java.util.List;

public class Program6 {

	static String reverseWithSpacesIntact(String S)
    {
		int length=S.length();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<length;i++) {
			if(S.charAt(i)==' ') {
				list.add(i);
			}
		}
		String[] words=S.split("\\s");
		StringBuilder builder=new StringBuilder();
		for(int j=words.length-1;j>=0;j--) {
			String present=words[j];
			for(int i=present.length()-1;i>=0;i--) {
				builder.append(present.charAt(i));
			}
		}

		for(Integer number:list) {
			builder.insert((int)number, ' ');
		}
		
		return builder.toString();		
    }
	public static void main(String[] args) {
		System.out.println(reverseWithSpacesIntact("hello everyone"));;
	}
}
