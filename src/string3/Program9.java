package string3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the word to check balance");
		String word=scanner.next();
		findBalancedPosition(word);
		scanner.close();
	}

	private static void findBalancedPosition(String word) {
		int length=word.length();
		if(length==0) {
			System.out.println("The enteres String is empty");
			return;
		}
		char[] characters=word.toCharArray();
		int leftCount=0;
		int rightCount=0;
		int leftDistance=1;
		int rightDistance=1;
		boolean isBalncePresent=true;
		Map<Character,Integer> characterWeight=new HashMap<>();
		for(int i=1;i<=26;i++) {
			characterWeight.put((char)(i+64), i);
		}
		for(int i=1;i<length;i++) {
			for(int j=0;j<length;j++) {
				if(j==i) {
					continue;
				}else if(j<i){
					leftCount+=(characterWeight.get(characters[j])*leftDistance);
					leftDistance++;
				}
				else if(j>i){
					rightCount+=(characterWeight.get(characters[j])*rightDistance);
					rightDistance++;
				}
			}
			if(leftCount==rightCount) {
				System.out.println("The balanced letter is "+characters[i]);
				isBalncePresent=false;
				break;
			}
			rightDistance=1;leftCount=0;
			leftDistance=1;rightCount=0;
		}
		if(isBalncePresent) {
			System.out.println("No Characters can be balanced");
		}
	}
	
}
