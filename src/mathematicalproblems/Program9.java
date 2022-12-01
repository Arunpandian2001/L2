package mathematicalproblems;

public class Program9 {

	public static void main(String[] args) {
		System.out.println(isSquare(1,1,1,1,1,1,1,1));
	}
	static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		 
        if((x1==x2 && x3==x4)&& (x1==x3 && x2==x4) && (y1==y2 && y3==y4) && (y1==y3 && y2==y4))
        return "No";
         
        // code here
		if(Math.abs(x1-x2)==Math.abs(x3-x4) && Math.abs(y1-y2)==Math.abs(y3-y4))
			return "Yes";
			
		return "No";
    }
}
