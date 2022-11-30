package pattern.numbers;

import java.util.Scanner;

public class Porgram3 {

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
			
			for(int space=0;space<size-row;space++) {
				System.out.print(" ");
			}
			
			for(int col=row;col>0;col--) {
				System.out.print(col);
			}
			
			for(int col=2;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		
		for(int row=1;row<=size-1;row++) {
			
			for(int space=0;space<row;space++) {
				System.out.print(" ");
			}
			
			for(int col=size-row;col>0;col--) {
				System.out.print(col);
			}
			
			for(int col=2;col<=size-row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		

	}
}
