package string1;

public class Program9 {

	static int maxChars(String s)
    {
	
		int position=0;
		char [] array=s.replaceAll(" ", "").toCharArray();
		for(int i=0;i<array.length;i++) {
							
			int start=s.indexOf(array[i]);
			int end=s.lastIndexOf(array[i]);
			if(position<(end-start)) {
				position=end-start;
			}
		}
		if(position>0) {
			return position-1;
		}
		return -1;
		
    }
	public static void main(String[] args) {
		System.out.println(maxChars("sockses"));
	}
}
