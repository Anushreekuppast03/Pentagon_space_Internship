
public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;//1,2,3,4,6,12
		int b=24;
	int max=(a<b)?b:a;
	for(int i=max;i<=(a*b);i++) {
		if(i%a==0 && i%b==0) {
			System.out.println(i);
			break;
		}
	}
	}

}
