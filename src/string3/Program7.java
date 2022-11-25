package string3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Word 1: ");
		String word1=scanner.next();
		System.out.println("Enter the Word 2: ");
		String word2=scanner.next();
		unlikePairs(word1,word2);
		scanner.close();
	}

	private static void unlikePairs(String string1, String string2) {
		
		if(string1.length()!=string2.length()) {
			System.out.println("The length of the two strings are unequal");
			return;
		}
		char[] word1=string1.toCharArray();
		char[]word2=string2.toCharArray();
		
		Map<String,String> unlikePairCollection=new HashMap<>();
		String temp1="";
		String temp2="";
		for(int i=0;i<word1.length;i++) {
			if(word1[i]!=word2[i]) {
				temp1=temp1+word1[i];
				temp2=temp2+word2[i];
			}else if(!unlikePairCollection.containsKey(temp1) && !temp1.isEmpty()){
				unlikePairCollection.put(temp1, temp2);
				temp1="";
				temp2="";
			}
		}
		for(Map.Entry<String,String> element:unlikePairCollection.entrySet()) {
			System.out.println(element.getKey()+","+element.getValue());
		}
	}
}
