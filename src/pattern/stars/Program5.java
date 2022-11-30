package pattern.stars;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("rows:");
		int size=scanner.nextInt();
		printPattern(size);
		scanner.close();
	}

	private static void printPattern(int size) {
		// TODO Auto-generated method stub
		for(int row=0;row<size;row++) {
			
			for(int col=0;col<=row;col++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int row=0;row<size-1;row++) {
		
			for(int col=0;col<size-1-row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
