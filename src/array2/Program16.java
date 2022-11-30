package array2;

public class Program16 {

	public static void main(String[] args) {
		int number=111;
		System.out.println(findPerfectNumber(number));
	}

	private static String findPerfectNumber(int number) {
		// TODO Auto-generated method stub
		int sum=findDigitsSum(number);
		String answer=number+""+(10-sum);
		return answer;
	}

	private static int findDigitsSum(int number) {
		// TODO Auto-generated method stub
		int rem=0,sum=0;
		while(number>0) {
			rem=number%10;
			number/=10;
			sum+=rem;
		}
		return sum;
	}
	
}
