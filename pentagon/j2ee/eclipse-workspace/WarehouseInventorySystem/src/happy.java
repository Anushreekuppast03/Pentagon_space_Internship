
public class happy {

	public static int sqr_digit(int num) {
		int res=0;
		while (num!=0) {
			int rem=num%10;
			res=(rem*rem)+res;
			num=num/10;
			
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=19;
int res=sqr_digit(num);

while(res!=1 && res!=4) {
	res=sqr_digit(res);
}


if(res==1) {
	System.out.println("it's happy");
}
if(res==4) {
	System.out.println();
}
	}

}
