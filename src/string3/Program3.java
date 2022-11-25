package string3;

public class Program3 {

	static int longestUniqueSubsttr(String S){
		String answer="";
        int length=S.length();
	        if(length==1) {
	        	return 1;
	        }
	        int longestString=0;
	        char[] word=S.toCharArray();
	        
	        for(int i=0;i<length;i++) {
	        	int j=i;
	        	while(j!=length) {
	        		
	        			if(answer.contains(String.valueOf(word[j]))) {
	        			    int answerLength=answer.length();
		        			if(longestString<answerLength) {
		        				longestString=answerLength;
		        			}
		        			answer="";
		        			break;
		        		}else {
		        			answer+=word[j];
		        			j++;
		        		}
	        		}
	        	}
	        return longestString;
	}
	public static void main(String[] args) {
		System.out.println(longestUniqueSubsttr("abcdhcbayr"));
	}
}
