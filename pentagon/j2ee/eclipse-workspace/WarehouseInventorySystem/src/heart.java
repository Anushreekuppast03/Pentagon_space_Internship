
public class heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=6;j++)
			{
			if((i==1&&j%3==0)||(i==0&&j%3!=0)||(i-2==j)||(i+j==8)){
				System.out.print("*"+" ");
			}
			else if(i==2&&j==2) {
				System.err.print("A"+" ");
			}
			else if(i==2&&j==3) {
				System.err.print("N"+" ");
			}
			else if(i==2&&j==4) {
				System.err.print("U"+" ");
			}
			else {
				System.out.print(" "+" ");
			}
			}
			System.out.println();
			
	}
		System.out.println();
		
		for(int i=5;i>=0;i--) {
		
			for(int j=0;j<=6;j++)
			{
			if((i==1&&j%3==0)||(i==0&&j%3!=0)||(i-2==j)||(i+j==8)){
				System.out.print("*"+" ");
			}
			
			else if(i==2&&j==3) {
				System.err.print("-"+" ");
			}
			
			else {
				System.out.print(" "+" ");
			}
			}
			System.out.println();
	}
}
}