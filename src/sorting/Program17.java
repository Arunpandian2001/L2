package sorting;

import java.util.ArrayList;

public class Program17 {

	public static void main(String[] args) {
		int candies[] = {3,2 ,1 ,4},N=candies.length,K=2;
		System.out.println(candyStore(candies,N,K));
	}
	static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(K==0)
			return emptyKValue(candies,N,list);
		
		candies=sort(candies,N);
		list.add(calculateMin(candies,N,K));
		list.add(calculateMax(candies,N,K));
		return list;
    }
	private static int calculateMin(int[] candies, int N, int K) {
		// TODO Auto-generated method stub
		int min=0;
		for(int i=0;i<=N;i++) {
			min+=candies[i];
			N-=K;
		}
		return min;
	}
	private static int calculateMax(int[] candies, int N, int K) {
		// TODO Auto-generated method stub
		int max=0,j=0;
		for(int i=N-1;i>=j;i--) {
			max+=candies[i];
			j+=K;
		}
		return max;
	}
	private static ArrayList<Integer> emptyKValue(int[] candies, int N, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=candies[i];
		}
		list.add(sum);list.add(sum);
		return list;
	}
	private static int[] sort(int[] candies, int N) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0;i<N-1;i++) {
			index=i;
			for(int j=i+1;j<N;j++) {
				if(candies[j]<candies[index])
					index=j;
			}
			int temp=candies[index];
			candies[index]=candies[i];
			candies[i]=temp;
		}
		return candies;
	}
}
