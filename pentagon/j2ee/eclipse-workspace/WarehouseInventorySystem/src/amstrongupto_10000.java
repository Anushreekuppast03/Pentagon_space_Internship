
public class amstrongupto_10000 {
	
	    // Method to count the number of digits
	    public static int count_digit(int num) {
	        int count = 0;
	        while (num != 0) {
	            num = num / 10;
	            count++;
	        }
	        return count;
	    }

	    // Method to calculate the Armstrong sum
	    public static int Armstrong(int num) {
	       
	        int count = count_digit(num);
	        int res = 0;

	        while (num != 0) {
	            int rem = num % 10;
	            res = (int) (Math.pow(rem, count)+res);
	            num = num / 10;
	        }

	        return res;
	    }

	    public static void main(String[] args) {
	        System.out.println("Armstrong numbers from 1 to 10000 are:");

	        for (int i = 1; i <= 10000; i++) {
	            if (i == Armstrong(i)) {
	                System.out.println(i);
	            }
	        }
	    }
	
}
