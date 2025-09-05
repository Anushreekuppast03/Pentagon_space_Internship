package packagecom.strings;

import java.util.Arrays;

public class chararr {
	public static char[] tocharArr(String s){
		char[] arr= new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
			
		}return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PenTaGoN";
		char [] arrS=tocharArr(s);
		System.out.println(Arrays.toString(arrS));
	}

}
