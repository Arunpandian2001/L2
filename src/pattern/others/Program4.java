package pattern.others;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		printPattern(size);
		scanner.close();
	}

	private static void printPattern(int size) {
		// TODO Auto-generated method stub
		int diff=1;
		for(int row=size;row>0;row--) {
			
			for(int space=0;space<row-1;space++) {
				System.out.print("*");//print row value
			}
			
			for(int col=1;col<=(diff*2)-1;col++) {
				System.out.print(row);
			}
			System.out.println();
		}
	} 
	
}
