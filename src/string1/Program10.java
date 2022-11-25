package string1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program10
{
	public static List<String> list;
	public static void permute(String word,String answer)
	{
		if(word.length()==0)
		{
			if(!list.contains(answer))
			{
            	list.add(answer);
            }
		}
		for(int i=0;i<word.length();i++)
		{
			char character=word.charAt(i);
			
			String remaining=word.substring(0,i)+word.substring(i+1);
			permute(remaining,answer+character);
		}
	}
	public static List<String> find_permutation(String S)
	{
        // Code here
		list=new ArrayList<>();
		permute(S,"");
		Collections.sort(list);
		return list;
    }
	public static void main(String[] args) {
		System.out.println(find_permutation("ABC"));
	}
}
