package pattern.numbers;

import java.util.Scanner;

public class Program2 {

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
			
			for(int space=0;space<size-row;space++) {
				System.out.print(" ");
			}
			int  num=1;
			for(int col=0;col<=row;col++) {
				System.out.print(num+" ");
				num=num*(row-col)/(col+1);/////////////keypoint
			}
			System.out.println();
		}
	}
}
