package string2;

public class Program7 {

	static String firstAlphabet(String S) {
        // code here
		String [] words=S.split("\\s");
		String answer="";
		for(String element:words) {
			answer+=element.charAt(0);
		}
		return answer;
    }
	public static void main(String[] args) {
		System.out.println(firstAlphabet("arun pandian s"));
	}
}
