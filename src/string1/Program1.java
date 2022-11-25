package string1;



public class Program1 {

	
	public static void main(String[] args) {
		Program1 dummy=new Program1();
		dummy.show("program");
	}

	public void show(String s) {
		int length=s.length()/2;
		String answer = "";
		char[] end=s.substring(length).toCharArray();
		char[] start=s.substring(0, length).toCharArray();
		
		for(int i=0;i<2;i++) {
			char[] word;
			if(i==0) {
				word=end;
			}
			else {
				word=start;
			}
			for(int j=0;j<word.length;j++) {
				answer+=word[j];
				System.out.print(answer+"$ ");
			}
		}
		
	}

}
