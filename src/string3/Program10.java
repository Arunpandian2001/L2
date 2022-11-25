package string3;

public class Program10 {

	public static String magicalString(String word1,String word2) {
		int length=word1.length();
		if((length!= word2.length()) || word1.compareTo(word2)>=0)
			return "No such String";
		
		StringBuilder builder=new StringBuilder(word1);
		char character=builder.charAt(length-1);
		builder.deleteCharAt(length-1);
		builder.append((char) (character+1));
		String word=builder.toString();
		if(word.equals(word2))
			return "No such string";
		
		return word;
		
	}
	public static void main(String[] args) {
		System.out.println(magicalString( "aaa", "aac"));;
	}
}
