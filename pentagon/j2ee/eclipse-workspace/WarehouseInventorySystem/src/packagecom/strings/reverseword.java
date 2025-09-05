package packagecom.strings;

import java.util.Arrays;

public class reverseword {

	
	public static String f_upper(String word) {//class
		String res="";
		for(int i=0;i<word.length();i++) {
			if(i==word.length()-1||i==0) {
				res=(char)(word.charAt(i)-32)+res;
			}
			else {
				res=word.charAt(i)+res;
			}
		}return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "welcome to the class";

String arr[]=s.split(" ");//{"welcome","to","the","class"}
System.out.println(Arrays.toString(arr));
for(int i=arr.length-1;i>=0;i--) {
	
	System.out.print(f_upper(arr[i])+" ");
	//System.out.print(f_upper(arr[i])+" ");
}
	}

}
