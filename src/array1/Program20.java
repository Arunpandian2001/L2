package dummy;

public class Program20 {

	public static void main(String[] args) {
		int [] nums={1,2,3,7,5};
		int meh=0;
		int target=12;
		int msf=Integer.MIN_VALUE;
		for(int j=1;j<nums.length;j++) {
			for(int i=j;i<nums.length;i=i+j) {
				meh+=nums[i];
				if(meh<nums[i]){
					meh=nums[i];
				}
				if(msf<meh) {
					msf=meh;
				}
				if(msf==target) {
					System.out.println(j+1+" "+(i+1));
					break;
				}
			}
			meh=0;msf=Integer.MIN_VALUE;
		}
	}
}
