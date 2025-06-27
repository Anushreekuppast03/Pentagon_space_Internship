import java.util.Scanner;

public class DisariumNumber {

    // Method to count the number of digits
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static boolean isDisarium(int num) {
        int digits = countDigits(num);
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            digits--;
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium Number.");
        } else {
            System.out.println(number + " is NOT a Disarium Number.");
        }

        sc.close(); // Best practice: close the scanner
    }
}
