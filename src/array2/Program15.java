package array2;

public class Program15 {

	public static void main(String[] args) {
		int []num= {-10, -10, 5, 2};
		largestMultiple(num,3);
	}

	private static void largestMultiple(int[] num, int j) {
		// TODO Auto-generated method stub
		int multiple=0;
		for(int i=0;i<num.length-j+1;i++) {
			int temp=num[i];
			for(int k=i;k<num.length-1;k++) {
				temp*=num[k];
			}
			if(temp>multiple) {
				multiple=temp;
			}
		}
		System.out.println(multiple);
	}
}
