package string2;

public class Program12 {

	public static boolean isValid(String s) {
        // Write your code here
		int length=s.length();
		int count=0;
		String [] numbers=s.split("\\.");
		for(int i=0;i<length;i++) {
			if(s.charAt(i)=='.') {
				count++;
			}
			if(Character.isAlphabetic(s.charAt(i))) {
				return false;
			}
		}
		if(length>15 || count!=3 || numbers.length==0) {
			return false;
		}
		for(String element:numbers) {
		    int elementLength=element.length();
	    	if(element.equals("") || elementLength>3 || (elementLength==3 && 
					(element.charAt(0)=='0' && element.charAt(1)=='0')) || 
					elementLength==2 && element.charAt(0)=='0') {
				return false;
			}
			int number=Integer.parseInt(element);
			if(number>255 || number<0 || (number==0 && element.length()!=1)) {
				return false;
			}
		}
		return true;
    }
	public static void main(String[] args) {
		System.out.println(isValid("a.b.c.e"));
	}
}
