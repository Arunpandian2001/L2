package string3;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter word 1 ::");
		String word1=scanner.next();
		System.out.println("Enter word 2 ::");
		String word2=scanner.next();
		if(isRotatable(word1,word2)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		scanner.close();
	}
	static boolean isRotatable(String word1,String word2) {
		char[] givenWord=word1.toCharArray();
		StringBuilder builder=new StringBuilder(word1);

		for(int i=0;i<givenWord.length;i++) {
			builder.insert(0, givenWord[givenWord.length-i-1]);
			builder.deleteCharAt(givenWord.length);
			if(builder.toString().equals(word2)) {
				return true;
			}
		}
		return false;
	}
}
