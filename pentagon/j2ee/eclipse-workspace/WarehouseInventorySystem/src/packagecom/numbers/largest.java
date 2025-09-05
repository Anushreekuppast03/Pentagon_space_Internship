package packagecom.numbers;


public class largest{
    public static int larDigit(int n) {
        int res = 0;
        while (n != 0) {
            int rem = n % 10;  //9,2
            if (rem > res) res = rem ; //9>0  --9=9  
            n = n / 10;// 5732
        }
        return res;
    }
    public static void main(String args[]) {
         int n = 57329;
        System.out.println("Largest digit in " + n + ": " + larDigit(n));
}} 
