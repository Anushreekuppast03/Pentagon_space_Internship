
public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int k=1;
for (int i=1;i<=row;i++) {
	for(int j=1;j<=i;j++) {
		if(k%2==0) {
		System.out.print((char)(k+96)+" ");
	
		}
		else {
			System.out.print((char)(k+64)+" ");
		}
		k++;
	}
	System.out.println();

}
	
	}

}

