
public class intN {


public static int sumOfDigits(int number) {
    int sum = 0;
    while (number != 0) {
        sum += number % 10;
        number = number / 10;
    }
    return sum;
}


public static int finf_next(int n) {
	int sums=2*sumOfDigits(n);
	 int cur=n+1;
	 while(true) {
		 if(sumOfDigits(cur)>=sums) {
			 return cur;
		 }
		 cur++;
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=99;
System.out.println("input"+n1+" "+finf_next(n1));
	}

}
