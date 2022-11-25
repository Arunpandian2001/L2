package string3;

public class Program2 {

	 
    static boolean arekAnagrams(String str1, String str2,int k)
    {
    	if(str1.length()!=str2.length()) {
    		return false;
    	}
        int length=str1.length();
        char[] array1=new char[26];
        char[]array2=new char[26];
        int count=0;
        for(int i=0;i<length;i++) {
        	array1[str1.charAt(i)-'a']++;
        	array2[str2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++) {
        	if(array1[i]>array2[i]) {
        		count+=Math.abs(array2[i]-array1[i]);
        	}
        }
       return (count<=k);
    }
	public static void main(String[] args) {
		System.out.println(arekAnagrams("fade", "gork", 2));
	}
}
