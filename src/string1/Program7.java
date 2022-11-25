package string1;

public class Program7 {
	static String crossPattern(String S){
		int length=S.length();
		int j=0;
		StringBuilder answer=new StringBuilder();
		 for (int i = 0; i < length; i++) {
	             j= length - 1 - i;
	            for (int k = 0; k < length; k++) {
	                if (k == i || k == j)
	                    answer.append((S.charAt(k)));
	                else
	                	answer.append((" "));
	            }
	            answer.append((" "));
	            j=0;
	        }
		return answer.toString();
    }
	public static void main(String[] args) {
		System.out.println(crossPattern("GEEKS"));;
	}
}
