package packagecom.strings;



import java.util.Arrays;

public class aa {
	public static String lowercase(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				char nch=(char) (ch+32);
				res+=nch;
			}
			else {
				res+=ch;
			}
		}
		return res;
	}
public static char[] chararray(String s) {
	char [] res=new char[s.length()];
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		res[i]=ch;
	}
	return res;
}

public static char[] sort(char [] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				char temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	return arr;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="silent";
		String s2="lisTem";
		String resS1=lowercase(s1);
		System.out.println(resS1);
		String resS2=lowercase(s2);
		System.out.println(resS2);
		char[] ch1=chararray(resS1);
		System.out.println(Arrays.toString(ch1));
		char[] ch2=chararray(resS2);
		System.out.println(Arrays.toString(ch2));
		ch1=sort(ch1);
		System.out.println(Arrays.toString(ch1));
		ch2=sort(ch2);
		System.out.println(Arrays.toString(ch2));
		if(ch1.length==ch2.length) {
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]==ch2[i]) {
				}
				else {
					System.out.println("its not ");
					System.exit(0);
				}
			}
			System.out.println("its angram");
		}
		else {
			System.out.println("its not");
		}
		
		
		
		

	}

}