package string2;

public class Program2 {
	static String removeChars(String string1, String string2){
        // code here
        for(int i=0;i<string2.length();i++){
            String character=String.valueOf(string2.charAt(i));
            if(string1.contains(character)){
            	string1=string1.replace(character,"");
            }
        }
        return string1;
    }
	public static void main(String[] args) {
		System.out.println(removeChars( "computer", "cat" ));;
	}
}
