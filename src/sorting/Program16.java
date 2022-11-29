package sorting;

public class Program16 {

	public static void main(String[] args) {
		long arr[] = {0, 1, 2, 3, 4, 5, 6,7};
		int length=arr.length;
		bitonicGenerator(arr,length);
	}
	 static void bitonicGenerator(long arr[], int n)
	 {
		 long[] odd;
		 long [] even;
		 int evenIndex=0;
		int oddIndex=0;
	    if(n%2==0) {
	    	odd=new long[n/2];
	    	even=new long[n/2];
	    }
	    else {
	    	odd=new long[n/2];
	    	even=new long[(n/2)+1];
	    }
		
	    for(int i=0;i<n;i++) {
	    	if(i%2==0) {
	    		even[evenIndex]=arr[i];
	    		evenIndex++;
	    		continue;
	    	}
	    	odd[oddIndex]=arr[i];
	    	oddIndex++;	
	    }
	    
	    for(int i=0;i<evenIndex;i++) {
	    	System.out.print(even[i]+" ");
	    }
	    for(int i=0;i<oddIndex;i++) {
	    	System.out.print(odd[i]+" ");
	    }
	 }
}
