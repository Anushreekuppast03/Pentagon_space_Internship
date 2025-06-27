import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		
int num =sc.nextInt();
int res=0;
while (num!=0) {
	int rem=num%10;
	res=(res*10)+rem;
	num=num/10;
}
//System.out.println("the reverse of the number"+" "+res);


	}

}
