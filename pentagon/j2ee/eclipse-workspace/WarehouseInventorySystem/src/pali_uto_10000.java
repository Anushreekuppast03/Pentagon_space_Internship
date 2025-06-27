
public class pali_uto_10000 {


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
	
	for(int k=1;k<=10000;k++) {
			int num=k;
	int res=reverse(num);
	if(num==res) {
		System.out.println(num);
	}
	
	}

}}


