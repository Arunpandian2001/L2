package array2;



public class Program3 {

	public static void main(String[] args) {
		int[] a={1, 2, 3, 4, 5};
		coinChange(a,5,10);
	}
	static void coinChange(int[] a,int n,int x) {
		int length=a.length;
		int num1=0;
		int num2=0;
		int temp=0;
		for(int i=0;i<length-1;i++) {
			for(int j=1;j<length;j++) {
				if(a[i]+a[j]<=x && a[i]+a[j]>temp) {
					num1=a[i];
					num2=a[j];
					temp=a[i]+a[j];
					continue;
				}
			}
		}
		System.out.println(num1+"  "+num2);
	}
}
