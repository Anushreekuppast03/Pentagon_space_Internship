import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		
				// TODO Auto-generated method stub
				Scanner sc=new Scanner (System.in);
				System.out.println("enter the number");
				
		int num =sc.nextInt();
		int res=0;
		int temp=num;
		while (num!=0) {
			int rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		//System.out.println(temp);
//System.out.println(res);		
if(temp==res) {
	System.out.println("it''s a palindron");
}
else {
	System.out.println("it''s not a palindron");
}

			}

		}

