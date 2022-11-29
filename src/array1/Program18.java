package dummy;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("size:");
		int size=scanner.nextInt();
		int[] array=new int[size];
		
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		no7UpElements(array);
		scanner.close();
	}

	private static void no7UpElements(int[] array) {
		// TODO Auto-generated method stub
		System.out.print(array[0]+" ");
		for(int i=1;i<array.length;i++) {
			if(array[i-1]%7==0) {
				System.out.print(array[i]+" ");
			}
		}
	}
}
