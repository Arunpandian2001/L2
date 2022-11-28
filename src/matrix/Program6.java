package matrix;

import java.util.ArrayList;
import java.util.List;

public class Program6 {

	public static void main(String[] args) {
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(matrix);
	}
	public static void setZeroes(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        int outerLength=matrix.length;
        int innerLength=matrix[0].length;
        for(int i=0;i<outerLength;i++) {
        	for(int j=0;j<innerLength;j++) {
        		if(matrix[i][j]==0) {
        			list.add(i);
        			list.add(j);
        		}
        	}
        }
        for(int k=0;k<list.size();k=k+2) {
        	int start=list.get(k);
        	int end=list.get(k+1);

        	for(int i=0;i<outerLength;i++) {
        		for(int j=0;j<innerLength;j++) {
        			if(i==start || j==end) {
        				matrix[i][j]=0;
        			}
        		}
        	}
        }
        for(int i=0;i<outerLength;i++) {
    		for(int j=0;j<innerLength;j++) {
    			System.out.print(matrix[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
}
