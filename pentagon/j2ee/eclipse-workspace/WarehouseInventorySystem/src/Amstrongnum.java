
public class Amstrongnum {

	
		// TODO Auto-generated method stub
		public static int count_digit(int num){
int count=0;
while(num!=0) {
	num=num/10;
	count++;
}
return count;
	}
		public static int Armstrong(int num) {
	       
	        int count = count_digit(num);
	        int res = 0;

	        while (num != 0) {
	            int rem = num % 10;
	            res = (int) (Math.pow(rem, count)+res);
	            num = num / 10;
	        }

	        return res ;
	    }
		
		public static void main(String[] args) {
			int num=153;
			int res=Armstrong(num);
			if(num==res) {
			System.out.println("it's amstrong");}
			else{
				System.out.println("it's not a amstrong");
			}
		}
}
