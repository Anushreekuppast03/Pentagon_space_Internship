
public class happy100000 {
	

	    public static int sqr_digit(int num) {
	        int res = 0;
	        while (num != 0) {
	            int rem = num % 10;
	            res = res + (rem * rem);
	            num = num / 10;
	        }
	        return res;
	    }

	    public static void main(String[] args) {
	        for (int i = 1; i <= 10000; i++) {
	            int res = i;

	            while (res != 1 && res != 4) {
	                res = sqr_digit(res);
	            }

	            if (res == 1) {
	                System.out.println(i + " is a happy number");
	            }
	        }
	    }
	}


