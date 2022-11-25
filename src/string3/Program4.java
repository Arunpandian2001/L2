package string3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean loop=true;
		System.out.println("Enter the number");
		int number=0;
		while(loop) {
			if(scanner.hasNextInt()) {
				number=scanner.nextInt();
				loop=false;
			}
			else {
				System.out.println("Enter only Integer type.");
				scanner.next();
			}
		}
		
		getNumberInWords(""+number);
		scanner.close();
	}

	private static void getNumberInWords(String number) {
		int length=number.length();
		if(length>4) {
			System.out.println("The entered number is invalid");
			return;
		}
		
		Map<Character,String>ones=new HashMap<>();
		ones.put('1', "One");ones.put('2', "Two");ones.put('3', "Three");ones.put('4', "Four");ones.put('5', "Five");
		ones.put('6', "Six");ones.put('7', "Seven");ones.put('8', "Eight");ones.put('9', "Nine");
		
		Map<String,String>elevenCollection=new HashMap<>();
		elevenCollection.put("19", "Ninteen");elevenCollection.put("11", "Eleven");elevenCollection.put("12", "Twelve");
		elevenCollection.put("13", "Thirteen");elevenCollection.put("14", "Fourteen");elevenCollection.put("15", "Fifteen");
		elevenCollection.put("16", "Sixteen");elevenCollection.put("17", "Seventeen");elevenCollection.put("18", "Eighteen");
		
		Map<Character,String>tens=new HashMap<>();
		tens.put('1', "Ten");tens.put('2', "Twenty");tens.put('3', "Thirty");tens.put('4', "Forty");
		tens.put('5', "Fifty");tens.put('6', "Sixty");tens.put('7', "Seventy");
		tens.put('8', "Eigthy");tens.put('9', "Ninety");
		
		
		if(length==1) {
			if(number.charAt(0)=='0' ) {//0
				System.out.println("Zero");
			}else {
				System.out.println(ones.get(number.charAt(0)));	//9			
			}
		}
		
		else if(length==2){
			if((number.charAt(0)=='1' && number.charAt(1)!='0')) {//11
				System.out.println(elevenCollection.get(number));				
			}else {//10    
				System.out.println(tens.get(number.charAt(0)));
			}
		}else if(length==3) {
			if(number.charAt(1)=='0' && number.charAt(2)=='0') {//100
				System.out.println(ones.get(number.charAt(0))+" Hundred");
			}
			else if(number.charAt(1)=='1' && number.charAt(2)!='0') {//111
				System.out.println(ones.get(number.charAt(0))+" Hundred and "+elevenCollection.get(number.substring(1)));
			}
			else if(number.charAt(1)!='0' && number.charAt(2)=='0') {//120
				System.out.println(ones.get(number.charAt(0))+" Hundred and "+tens.get(number.charAt(1)));
			}
			else if(number.charAt(1)!='0' && number.charAt(2)!='0') {//125
				System.out.println(ones.get(number.charAt(0))+" Hundred and "+tens.get(number.charAt(1))+" "+
						 ones.get(number.charAt(2)));
			}
		}else if(length==4) {
			if(number.charAt(1)=='0' && number.charAt(2)=='0' && number.charAt(3)=='0') {//1000
				System.out.println(ones.get(number.charAt(0))+" Thousand ");
			}
			else if(number.charAt(1)!='0' && number.charAt(2)=='0' && number.charAt(3)=='0') {//1100
				System.out.println(ones.get(number.charAt(0))+" Thousand and "+ones.get(number.charAt(1))+" Hundred");
			}
			else if(number.charAt(1)!='0' && number.charAt(2)!='0' && number.charAt(3)=='0') {//1110
				System.out.println(ones.get(number.charAt(0))+" Thousand and "+
						ones.get(number.charAt(1))+" Hundred and "+tens.get(number.charAt(2)));
			}
			else if(number.charAt(1)!='0' && number.charAt(2)!='0' && number.charAt(3)!='0') {//1111
				System.out.println(ones.get(number.charAt(0))+" Thousand and "+
						ones.get(number.charAt(1))+" Hundred and "+elevenCollection.get(number.substring(2)));
			}
			else if(number.charAt(1)=='0' && number.charAt(2)!='0' && number.charAt(3)=='0') {//1010
				System.out.println(ones.get(number.charAt(0))+" Thousand and "+
						tens.get(number.charAt(2)));
			}
			else if(number.charAt(1)=='0' && number.charAt(2)=='0' && number.charAt(3)!='0') {//1001
				System.out.println(ones.get(number.charAt(0))+" Thousand and "+
						ones.get(number.charAt(3)));
			}
		}
	}
}
