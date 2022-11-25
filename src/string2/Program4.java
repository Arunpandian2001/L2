package string2;

import java.util.Stack;

public class Program4 {

	 public static boolean isValid(String s) {
		if(s.length()%2!=0) {
			 return false;
		 }
		Stack<Character>stack=new Stack<Character>();
		
		for(char character:s.toCharArray()) {
			if(character=='(' || character=='{' || character=='[') {
				stack.push(character);
				continue;
			}	
			else if(stack.empty()) 
				return false;
			
			char top=stack.pop();
			if(top=='(' && character!=')') 
				return false;
			if(top=='{' && character!='}') 
				return false;
			if(top=='[' && character!=']') 
				return false;
		}
		return stack.empty();
		
	 }
	 public static void main(String[] args) {
		System.out.println(isValid("(("));
	}
}
