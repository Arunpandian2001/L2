package array2;

import java.util.HashMap;
import java.util.Map;

public class Program5 {

	public static void main(String[] args) {
		char[] arr1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
		char[] arr2={ 'a', 'b', 'd', 'e', 'e', 'g' ,'g' ,'i','i'};
		unLikePair(arr1,arr2);
	}
	static void unLikePair(char[] arr1, char[] arr2) {
		if(arr1.length!=arr2.length) {
			System.out.println("The length of the two arrays are unequal");
			return;
		}
		Map<String,String> unlikePairCollection=new HashMap<>();
		String temp1="";
		String temp2="";
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				temp1=temp1+arr1[i];
				temp2=temp2+arr2[i];
			}else if(!unlikePairCollection.containsKey(temp1) && !temp1.isEmpty()){
				unlikePairCollection.put(temp1, temp2);
				temp1="";
				temp2="";
			}
		}
		for(Map.Entry<String,String> element:unlikePairCollection.entrySet()) {
			System.out.println(element.getKey()+","+element.getValue());
		}
	}
}
