package string1;

public class Program8 {
	 static boolean kPangram(String str, int k){
		
		 String word=str.toLowerCase().replaceAll("\\s", "");
		 int length=word.length();
		 int count=0;
		 if(length>=26){
			 for(int i=0;i<length;i++) {
				 if(!Character.isAlphabetic(word.charAt(i))) {
					return false;
				 }
			 }
			 for(int j=0;j<26;j++) {
				 char letter=(char) (j+97);
				 if(word.contains(String.valueOf(letter))) {
					 count++;
				 }
			 }
		 }else {
			 return false;  			 
		 }
		 if((26-count)<=k) {
			 return true;
		 }else {
			 return false;
		 }

	 }
	 public static void main(String[] args) {
		System.out.println( kPangram( "k uqsr hye i", 27));;
	}
}
