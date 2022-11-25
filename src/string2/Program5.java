package string2;

public class Program5 {

	public static String countAndSay(int n) {
       if(n==1) {
    	   return "1";
       }
        String answer="1",temp="";
        int count=1;
        for(int i=2;i<=n;i++)
        {
        	temp="";
        	for(int j=0;j<answer.length();j++) 
        	{
        		char character=answer.charAt(j);
        		if(j==answer.length()-1)
        		{
        			temp = temp + count+character;
        			count=1;
        		}
        		else if(answer.charAt(j+1)==character)
        		{
        			count++;
        		}
        		else 
        		{
        			temp=temp+count+character;
        			count=1;
        		}
        	}
        	answer=temp;
        }
		return answer;
    }
	public static void main(String[] args) {
		System.out.println(countAndSay(4));
	}
}
