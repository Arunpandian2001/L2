package pattern.numbers;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("rows:");
		int size=scanner.nextInt();
		printPattern(size);
		scanner.close();
	}

	private static void printPattern(int size) {
		// TODO Auto-generated method stub
		
		for(int row=1;row<=size;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
