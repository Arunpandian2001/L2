package pattern.others;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		printPattern(size);
		scanner.close();
	}

	private static void printPattern(int size) {
		// TODO Auto-generated method stub
		for(int row=0;row<size;row++) {
			
			if(row==0 || row==size-1) {
				for(int col=0;col<size-1;col++) {
					System.out.print("*");
				}
			}
			else {
				for(int space=0;space<size-row-1;space++) {
					System.out.print(" ");
				}
			}
			System.out.print("*");
			System.out.println();
		}
		
	}
}
