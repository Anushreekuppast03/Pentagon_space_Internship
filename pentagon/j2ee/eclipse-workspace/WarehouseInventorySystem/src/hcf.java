
public class hcf {
public static void main(String[] args) {
	int a=12;//1,2,3,4,6,12
	int b=6;//1,2,3,6
	int hcf=1;
	int smallest=(a>b)?b:a;
	for(int i=1;i<=smallest;i++) {
		if(a%i==0 &&b%i==0) {
			hcf=i;//1.2,3,6
		}
	}
	System.out.println(hcf);
}
}
