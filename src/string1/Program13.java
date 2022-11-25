package string1;

public class Program13 {
	 static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder builder1=new StringBuilder(); 
		StringBuilder builder2=new StringBuilder(); 
		for(int i=0;i<word1.length;i++) {
			builder1.append(word1[i]);
		}
		for(int i=0;i<word2.length;i++) {
			builder2.append(word2[i]);
		}
		
		if(builder1.toString().equals(builder2.toString())) {
			return true;
		}
		 return false;
	        
	 }
	 public static void main(String[] args) {
		 String[] word1={"ab", "c"};
		 String[] word2={"a", "bc"};
		 System.out.println(arrayStringsAreEqual(word1,word2 ));
	}
}
