package string3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String ::");
		String word=scanner.next();
		firstUniqueCharacter(word);

		scanner.close();
	}

	private static void firstUniqueCharacter(String word) {
		int length=word.length();
		boolean isAvailable=true;
		if(length==1) {
			System.out.println("The unique character is "+word);
			return;
		}
		Map<Character,Integer> characters=new LinkedHashMap<>();
		for(int i=0;i<length;i++) {
			if(i==0 || !characters.containsKey(word.charAt(i))) {
				characters.put(word.charAt(i), 0);				
			}else {
				int count=characters.get(word.charAt(i))+1;
				characters.put(word.charAt(i), count);
			}
		}
		for(Map.Entry<Character,Integer>element:characters.entrySet()) {
			if(element.getValue()==0) {
				System.out.println(element.getKey());
				isAvailable=false;
				break;
			}
		}
		if(isAvailable) {
			System.out.println("No such String");
		}
	}
}
