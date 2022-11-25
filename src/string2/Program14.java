package string2;

import java.util.ArrayList;
import java.util.List;

public class Program14 {

	private static List<String> list ;
	public static void permute(String word,String answer) {

		if(word.length()==0) {
			if(!list.contains(answer)) {
				list.add(answer);
			}
		}
		for(int i=0;i<word.length();i++) {
			char character=word.charAt(i);
			String remaining=word.substring(0, i)+word.substring(i+1);
			permute(remaining,answer+character);
		}
	}
	public static boolean checkInclusion(String s1, String s2) {
		if(s1.equals(s2)) {
			return true;
		}
		list = new ArrayList<>();
		List<String> wordsList=new ArrayList<>();
		permute(s1,"");
		wordsList=list;
		int length=s1.length();
		for(int i=0;i<=s2.length()-length;i++) {
			String sequence=(String) s2.subSequence(i, i+length);
			if(wordsList.contains(sequence)) {
				return true;
			}
		}
		return false;
	}
    public static void main(String[] args)
    {
        System.out.println(checkInclusion("ab", "eidbaooo"));
        
    }
}
