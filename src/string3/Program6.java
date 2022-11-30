package string3;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("size:");
		int size=scanner.nextInt();
		scanner.nextLine();
		String array[]=new String[size];
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextLine();
		}
		scanner.close();
		System.out.println(getCommonString(array,size));
	}

	private static String getCommonString(String[] array, int size) {
		// TODO Auto-generated method stub
		
		for(String element:array) {
			
		}
		return "No such String";
	}
}
