
//approach ----------------1
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for (int i=1;i<=row;i++) {
			int k=i;
	
			for(int j=1;j<=i;j++) {
				if (k%2==0) {
					System.out.print(0+" ");
				}
				else {
					System.out.print(1+" ");
				}
			k++;}
			System.out.println();}
		
		//approach ----------------2
		
		
		// TODO Auto-generated method stub
				int rows=5;
				for (int i=1;i<=rows;i++) {
					int k=i;
			
					for(int j=1;j<=i;j++) {
						System.out.print(k%2+" ");
					k++;}
					System.out.println();}
				
		
	}

}
