package string1;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
	public static void main(String[] args) {
		System.out.println("String ::"+printString("RvvyRv",'v',3));
	}
	static String printString(String S, char ch, int count) {
        // code here
		  if(count==0){
	            return S;
	        }
	       List<Integer> position=new ArrayList<>();
	        String answer="";
	        for(int i=0;i<S.length();i++){
	            if(S.charAt(i)==ch){
	                position.add(i);
	            }
	        }
	        int size=position.size();

	        if(count>size || size==0 || ((position.get(0)==S.length()-1) ) ){
	            return "Empty string";
	        }
	        else{
	           
	            int requiredPosition=position.get(count-1);
	            
	             answer=S.substring(requiredPosition+1);

	             if(answer.isEmpty()){
	                 return "Empty string";
	             }
	        }
			return answer;
    }
}
