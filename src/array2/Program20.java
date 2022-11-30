package array2;

public class Program20 {

	public static void main(String[] args) {
		int array[]= {12,19,38,56,34,23,18,69,41,12,45,78,43,99,10};
		pattern(array,array.length);
	}

	private static void pattern(int[] array, int length) {
		// TODO Auto-generated method stub

		for(int i=0;i<=length-1;i++) {
			int temp=i;
			while(temp>-1) {
				System.out.println(array[temp]);
				
			}
		}
	}
}
