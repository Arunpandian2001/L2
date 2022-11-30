package pattern.stars;

import java.util.Scanner;

public class Program8 {

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
			
			for(int space=0;space<size-row-1;space++) {
				System.out.print(" ");
			}
			for(int col=0;col<=row*2;col++) {
				if(col==0 || col==row*2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

		for(int row=size-1; row>=1; row--)  
		{  
			
			for(int space=0;space<size-row;space++) {
				System.out.print(" ");
			}
			for(int col=0;col<=row*2;col++) {
				if(col==0 || col==row*2-2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}  
	}
}
