package mathematicalproblems;

public class Program6 {
	
	public static void main(String[] args) {
		System.out.println(count(10));
	}
	static long count(int number)        
	{
		// code here
		
		return oddFactorsWithinNumber(number);
	}
	private static long oddFactorsWithinNumber(int number) {
		// TODO Auto-generated method stub
		long factor=0;
		
		for(int i=1;i<=number;i++) {
			factor+=getOddFactors(i,number);
		}
		return factor;
	}
	private static long getOddFactors(int element, int number) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=element;i++) {
			if(element%i==0)
				count++;
		}
		if (count%2!=0)
			return 1;
		
		return 0;
	}

}
