package sorting;

import java.util.Arrays;

public class Program10 {

	public static void main(String[] args) {
		String a = "geeksforgeeks", b = "forgeeksgeeks";
		System.out.println(isAnagram(a,b));
	}
	public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
      int length1=a.length();
		int length2=b.length();
		if(length1!=length2) 
			return false;
       char[] array1=a.toCharArray();
       char[] array2=b.toCharArray();
       Arrays.sort(array1);Arrays.sort(array2);
       if(String.valueOf(array1).compareTo(String.valueOf(array2))==0)
    	   return true;
        
       return false;
        
    }
}
