
public class without_extra_vapallindrom {

	
		// TODO Auto-generated method stub
public static int reverse(int n) {
	int res=0;

	while (n!=0) {
		int rem=n%10;
		res=(res*10)+rem;
		n=n/10;
	}
return res;
}
public static void main(String[] args) {
	int num=1221;
	int res=reverse(num);
	if(num==res) {
		System.out.println("it''s a palindrome");
	}
	else {
		System.out.println("it''s not a palindrome");
	}
	}

}
