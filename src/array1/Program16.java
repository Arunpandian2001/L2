package dummy;

public class Program16 {

	public static void main(String[] args) {
		int nums[]= {9};
		System.out.println(incrementAtEnd(nums));
	}

	private static int[] incrementAtEnd(int[] nums) {
		// TODO Auto-generated method stub
		int length=nums.length;
		int number=0;
		int count=0;
		boolean isNineAvailable=false;
		for(int i=length-1;i>=0;i--) {
			number+=(nums[i]*Math.pow(10, count));
			count++;
			if(nums[i]==9) {
				isNineAvailable=true;
			}
		}
		number++;
		int answer[];
		if(isNineAvailable) {
			answer=new int[length+1];
		}else {
			answer=new int[length];
		}
		int i=answer.length-1;
		while(number>0) {
			answer[i]=number%10;
			number=number/10;
			i--;
		}
		return answer;
	}
	
}
