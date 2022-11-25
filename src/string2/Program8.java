package string2;

public class Program8 {

	static String encryptString(String S){
      
		char []array=S.toCharArray();
		int length=array.length;
		StringBuilder builder=new StringBuilder();
		int count=1;
		for(int i=length-1;i>=0;i--) {
			char temp=array[i];
			if(i!=0) {
				if(array[i-1]==temp) {
					count++;
				}else {
					builder.append(Integer.toHexString(count));
					builder.append(temp);
					count=1;
				}
			}else {
				builder.append(Integer.toHexString(count));
				builder.append(temp);
			}
		}
		return builder.toString();
    }
	public static void main(String[] args) {
		System.out.println(encryptString("aaaaaaaaaaa"));
	}
}
