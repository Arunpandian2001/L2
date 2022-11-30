package array2;

public class Program19 {

	public static void main(String[] args) {
		int array[]= {901, 40 ,35, 0, 60, 900 ,903 ,1000};
		findMinimumDifference(array,array.length);
	}

	private static void findMinimumDifference(int[] array, int length) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		int element1 = 0,element2 = 0;
		for(int k=0;k<length-1;k++) {
			for(int i=k+1;i<length;i++) {
				int temp=Math.abs(array[k]-array[i]);
				if(temp<min) {
					min=temp;
					element1=array[k];
					element2=array[i];
				}
			}
		}
		System.out.println(element1+" "+element2);
	}
	
}
