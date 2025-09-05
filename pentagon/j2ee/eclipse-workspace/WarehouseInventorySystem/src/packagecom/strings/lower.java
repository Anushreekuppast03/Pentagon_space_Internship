package packagecom.strings;

//5

public class lower {
public static String toUpper(String s){
	String res="";
	for(int i=0;i<s.length();i++) {
		char ch= s.charAt(i);
		if(ch>=65 && ch<=90) {
			
			char nch=(char)(ch+32);
			res+=(nch);
		}
		else {
			res+=(ch);
			
		}
	}
	return res;
}
public static void main(String[] args) {	// TODO Auto-generated method stub
String s="PenTaGoN";

String res=toUpper(s);
System.out.println(res);

}

}

