package string1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		List<String> B=new ArrayList<>();
		B.add("bbipzzrzu");B.add("xamludf");B.add("kgruowz");B.add("oobpple");B.add("i");B.add("lwphapjna");B.add("qhdcnvwdtx");
		System.out.println(wordBreak("oobpplekgruowzlwphapjnaiqhdcnvwdtxkgruowzqhdcnvwdtxlwphapjna",B));
	}
	public static int wordBreak(String A, List<String> B )
    {
        
		Collections.sort(B,Comparator.comparingInt(String ::length).reversed());
		for(int i=0;i<B.size();i++) {
			String replaceString=B.get(i);
			if(A.contains(replaceString)) {
				
				A=A.replace(replaceString, "");
			}
		}
		
		if(A.equals("")) {
			return 1;
		}else {
			return 0;
		}
		
    }
}
