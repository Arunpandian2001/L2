package string2;

public class Program11 {

	public static boolean isRotated(String str1, String str2)
    {
        // Your code here
		
		String antiStart=str1.substring(0, 2);
		String antiEnd=str1.substring(2, str1.length());
		String start=str1.substring(0, str1.length()-2);
		String end=str1.substring(str1.length()-2, str1.length());
		String clock=end.concat(start);
		String antiClock=antiEnd.concat(antiStart);
		if(antiClock.equals(str2) || clock.equals(str2)) {
			return true;
		}
		return false;
    }
	public static void main(String[] args) {
		System.out.println(isRotated( "fsbcnuvqhffbsaqxwp", "wpfsbcnuvqhffbsaqx"));
	}
}
