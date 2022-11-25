package array1;

public class Program5 {

	public static void main(String[] args) {
		System.out.println(runLengthCoding("aaaabbbccc"));
	}
	public static String runLengthCoding(String str) {
		int count=1;
        int length=str.length();
        String answer="";
        char [] array=str.toCharArray();
        for(int i=0;i<length;i++){
            char temp=array[i];
            if(i!=length-1){
                if(temp==array[i+1]){
                    count++;
                }else{
                    answer=answer+temp+count;
                    count=1;
                }
            }else{
                answer=answer+temp+count;
            }
        }
      return answer; 
	}
}
