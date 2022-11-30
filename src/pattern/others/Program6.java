package pattern.others;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String word=scanner.nextLine();
		printPattern(word.length(),word.toCharArray());
		scanner.close();
	}

	private static void printPattern(int size, char[] word) {
		// TODO Auto-generated method stub
		if(size%2==0) {
			System.out.println("The given string is even length");
			return;
		}
		int div=size/2;
		int start=0,end=size-1;
		for(int row=0;row<=div;row++) {
			if(start==end) {
				System.out.print(word[start]);
			}else {
				System.out.print(word[start]+""+word[end]);
			}
			start++;
			end--;
			System.out.println();
		}
		start=div-1;end=div+1;
		for(int row=0;row<div;row++) {
			System.out.print(word[start]+""+word[end]);
			start--;
			end++;
			System.out.println();
		}
		
	}

}
