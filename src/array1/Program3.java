package array1;

public class Program3 {

	static long maxSubarraySum(int arr[], int n){
        
        // Your code here
		int meh=0;
		int msf=Integer.MIN_VALUE;
		for(int number:arr) {
			meh+=number;
			if(meh<number) {
				meh=number;
			}
			if(msf<meh) {
				msf=meh;
			}
		}
        
		return msf;
    }
	public static void main(String[] args) {
		int arr[] = {1,2,3,-2,5};
		System.out.println(maxSubarraySum( arr,  arr.length));
	}
}
