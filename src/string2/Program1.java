package string2;

public class Program1 {
	 public static boolean checkIfPangram(String sentence) {
		 String word=sentence.toLowerCase().replaceAll("\\s", "");
		 int length=word.length();
		 if(length>=26){
			 for(int i=0;i<length;i++) {
				 if(!Character.isAlphabetic(word.charAt(i))) {
					return false;
				 }
			 }
			 for(int j=0;j<26;j++) {
				 char letter=(char) (j+97);
				 if(!word.contains(String.valueOf(letter))) {
					 return false;
				 }
			 }
		 } 
		 return true;  			 
	 }
	 public static void main(String[] args) {
		System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}
	
}
