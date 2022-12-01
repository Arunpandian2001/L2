package mathematicalproblems;

public class Program5 {

	public static void main(String[] args) {
		System.out.println(isPallindrome(17745L));
	}

	static long isPallindrome(long number){
        // code here
		long binary=getBinaryNumber(number);
		StringBuilder num=new StringBuilder();
		num.append(binary);
		String num1=num.toString(); 
		StringBuilder num2=num.reverse();

		if(num1.equals(num2.toString()))
			return 1;
		
		
		return 0;
    }

	private static long getBinaryNumber(long number) {
		// TODO Auto-generated method stub
		long rem=0,binary=0,power=0;
		while(number>0) {
			rem=(int) (number%2);
			number/=2;
			if(rem!=0)
				binary+=(rem*Math.pow(10, power));
			power++;
		}
		return binary;
	}
}
