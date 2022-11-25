package string3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;


public class Program11 {
	
	private static Set<String>set1=new HashSet<>();
	private static Set<String>set2=new HashSet<>();

	public static void main(String[] args) {
		
		char[] array={'a','b','c'};
		getPossibleStrings(array);
		List<String> list=new ArrayList<>(set2);
		Collections.sort(list);
		System.out.println(list);
	}

	private static void getPossibleStrings(char[] array) {
		int length=array.length;
		String temp="";
		for(int i=0;i<length;i++) {
			temp+=""+array[i];
		}
		permute(temp,"",set1);//
		set2.addAll(set1);
		Iterator<String> value=set1.iterator();
		while(value.hasNext()) {
			String element=(String) value.next();
			String pass="";
			for(int i=0;i<element.length()-1;i++) {
				pass+=""+element.charAt(i);
				permute(pass,"",set2);
			
			}
		}
	}

	private static void permute(String word, String answer,Set<String> set) {//
		
		if(word.length()==0) {
			set.add(answer);
		}
		for(int i=0;i<word.length();i++) {
			char temp=word.charAt(i);
			String remaining=word.substring(0, i)+word.substring(i+1);
			permute(remaining,answer+temp,set);//
		}
		
	}
}
