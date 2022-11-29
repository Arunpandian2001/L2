package matrix;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program4 {

	public static void main(String[] args) {
		int M[][] = {{1, 1, 0, 1},{1, 0, 0, 1},{1, 1, 0, 1}},row = M.length, col = M[0].length;
		System.out.println(uniqueRow(M,row,col));
	}
	public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
		Set<ArrayList<Integer>> set=new LinkedHashSet<>();
		
		for(int i=0;i<r;i++) {
			ArrayList<Integer> innerList=new ArrayList<>();
			for(int j=0;j<c;j++) {
				innerList.add(a[i][j]);
			}
			set.add(innerList);
		}
				
		return new ArrayList<>(set);
    }
	
}
