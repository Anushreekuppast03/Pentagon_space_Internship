package dsa;

public class fact3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=24;
for(int i=1;i<=Math.sqrt(n);i++) {
	if(n%i==0) {
	System.out.println(i);
	System.out.println(n/i);
	}
}
	}

}
